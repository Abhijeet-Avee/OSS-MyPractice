package multithreading;

public class DemoThread3 {
	public static void main(String[] args) {
		//Using anonymous inner class
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Job of the thread...");
			}
			
		});
		thread.start();
		
		//Using lambda expression
		Thread thread2 = new Thread(()->System.out.println("Job of the thread..."));
		thread2.start();
	}
}
