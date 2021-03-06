package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class IOBoundProcessJob implements Runnable{

	@Override
	public void run() {
		System.out.println("Cpu bound process..."+Thread.currentThread().getName());		
	}
	
}

public class ThreadPoolIO {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
				
		for(int i=0;i<20;i++) {
			es.execute(new IOBoundProcessJob());
		}
	}
}
