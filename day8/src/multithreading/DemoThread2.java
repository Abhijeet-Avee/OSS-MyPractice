package multithreading;

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Job of the thread");
	}
}


public class DemoThread2 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
