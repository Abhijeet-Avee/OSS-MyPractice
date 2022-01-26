package multithreading;

// to avoid deadlock, we can allocate lock/resource in same order so that one thread may take both the resource(r1 nad r2)
// use it and release it for another thread.
// if alternatively done, one thread may hold r1 and wait for r2 while another thread may hold r2 and wait for r1
// hence resulting in a deadlock!!!

public class DemoDeadLock {
	public static void main(String[] args) {
		final String r1 = "resource1";
		final String r2 = "resource2";
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(r1) {
					System.out.println("Thread1 get lock on r1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(r2) {
						System.out.println("Thread1 get lock on r2");
					}
				}
			}
			
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(r2) {
					System.out.println("Thread2 get lock on r2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(r1) {
						System.out.println("Thread2 get lock on r1");
					}
				}
			}		
		});
		thread1.start();
		thread2.start();
	}
}
