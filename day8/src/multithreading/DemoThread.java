package multithreading;

//worker and job
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("Job Has Started: "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Job is done: "+ Thread.currentThread().getName());
	}
	
}


public class DemoThread {
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getId()
//				+" : "+Thread.currentThread().getPriority());
		System.out.println("Starting the main..."+Thread.currentThread().getName());
		MyJob job = new MyJob();
		Thread thread = new Thread(job,"A");
		Thread thread2 = new Thread(job,"B");
		Thread thread3 = new Thread(job,"C");
		Thread thread4 = new Thread(job,"D");
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		try {
			thread.join(1000);		//main thread waits 1000ms for thread1 to finish before finishing itself
			thread2.join();			//main thread waits until thread2 is finished
			thread3.join(1000,2000);	//main thread waits in ms,nanonseconds
			thread4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ending the main..."+Thread.currentThread().getName());
	}
}
