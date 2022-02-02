package advance.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Blocking queue: solution to P and C problem
//JUC Package [iava.util.concurrent toolkit]

public class DemoBlockingQueue {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
