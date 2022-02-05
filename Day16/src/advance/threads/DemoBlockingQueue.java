package advance.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Blocking queue: solution to P and C problem
//JUC Package [iava.util.concurrent toolkit]

public class DemoBlockingQueue {
	//used as data buffer
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(1);
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}				
		});
		t1.start();
		t2.start();
	}

	protected static void consume() throws InterruptedException {
		while(true) {
			//Thread.sleep(100);
			Integer val = queue.take();
			System.out.println("Consumed: "+ val + " Queue_Size: "+ queue.size());
		}
	}

	protected static void produce() throws InterruptedException {
		Random random = new Random();
		while(true) {
			Integer val = random.nextInt(100);
			System.out.println("Produced: "+ val + " Queue_Size: "+queue.size());
			queue.put(val);
		}
	}
}
