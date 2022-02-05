package advance.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * 5 kind of threads pools: io bound process vs cpu bound process
 * FixedThreadPool
 * CachedThreadPool
 * ScheduledThreadPool
 * SingleTaskExcecutor
 * ForkJoinThreadPool
 */
//class CpuBoundProcess implements Runnable{
//	@Override
//	public void run() {
//		//some heavy cpu calculations ....
//		System.out.println("some cpu intensive jobs..."+Thread.currentThread().getName());
//	}	
//}

class IOBoundProcess implements Runnable{
	@Override
	public void run() {
		//some heavy cpu calculations ....
		synchronized (this) {
			System.out.println("some IO intensive jobs..."+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {}
			System.out.println("some IO intensive jobs is done..."+Thread.currentThread().getName());
		}
	}	
}

public class ThreadPoolDemo{

	public static void main(String[] args)  {
		int noOfTh= Runtime.getRuntime().availableProcessors();
		ScheduledExecutorService service=Executors.newScheduledThreadPool(4);
		
		//service.schedule(new IOBoundProcess(), 10, TimeUnit.SECONDS);
		
		service.scheduleWithFixedDelay(new IOBoundProcess(), 1, 2, TimeUnit.SECONDS);
		
//		
//		for(int i=0;i< 100; i++) {
//			executorService.execute(new IOBoundProcess());
//		}
	}

}