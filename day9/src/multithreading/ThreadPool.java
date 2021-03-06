package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CpuBoundProcessJob implements Runnable{

	@Override
	public void run() {
		System.out.println("Cpu bound process..."+Thread.currentThread().getName());		
	}
	
}

public class ThreadPool {
	public static void main(String[] args) {
		int availableCores = Runtime.getRuntime().availableProcessors();
		System.out.println(availableCores);
		ExecutorService es = Executors.newFixedThreadPool(availableCores);
		
//		es.execute(new CpuBoundProcessJob());
		
		for(int i=0;i<10;i++) {
			es.execute(new CpuBoundProcessJob());
		}
	}
}
