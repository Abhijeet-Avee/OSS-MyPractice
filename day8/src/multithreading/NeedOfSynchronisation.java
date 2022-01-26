package multithreading;

class Printer {
	public void print(String letter) {
		synchronized (this) {							//synchronized block is better than synchronized method since not all code will be critical
			System.out.print("[" + letter);			//that needs to be synchronized
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.print("]");
		}
	}
}

class Client implements Runnable {
	private Thread thread;
	private String letter;
	private Printer printer;

	public Client(String letter, Printer printer) {
		super();
		this.thread = new Thread(this);
		this.thread.start();
		this.letter = letter;
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.print(letter);
	}

}

public class NeedOfSynchronisation {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Client client1 = new Client("i love java", printer);
		Client client2 = new Client("i love Javascript", printer);
		Client client3 = new Client("i love C#", printer);
		
	}
}
