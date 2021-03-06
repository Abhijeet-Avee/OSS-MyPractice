package multithreading;

class MyJob4 implements Runnable{
	private Thread thread;
	
	public MyJob4(String name) {
		thread = new Thread(this, name);
	}
	
	public void threadStart() {
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println("Job of the thread");
	}
}

public class DemoThread4 {
	public static void main(String[] args) {
		MyJob4 myjob = new MyJob4("foo");
		myjob.threadStart();
	}
}
