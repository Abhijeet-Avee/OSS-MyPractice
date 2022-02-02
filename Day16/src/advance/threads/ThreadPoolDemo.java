package advance.threads;

/**
 * Depending the on kind of operation [IO bound or CPU bound],
 * the choice of thread pool is determined
 * 5 kind of threads pool: 
 * FixedThreadPool
 * CachedThreadPool
 * ScheduledThreadPool
 * SingleTaskExecutor
 * ForkJoinThreadPool
 * **/

class CpuBoundProcess implements Runnable{

	@Override
	public void run() {
		//some heavy cpu calculations...
		System.out.println("Some CPU intensive jobs"+);
	}
	
}

public class ThreadPoolDemo {
	public static void main(String[] args) {
		
	}
}
