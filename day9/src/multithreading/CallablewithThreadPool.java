package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Factorial implements Callable<Long>{
	private long n;
	
	public Factorial(long n) {
		this.n=n;
	}
	
	@Override
	public Long call() throws Exception {
		if(n<0) {
			throw new Exception("n should be a positive integer");
		}
		long fact = 1;
		for(long i=1;i<=n;i++) {
			fact*=1;
		}
		return fact;
	}
	
}


public class CallablewithThreadPool {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Factorial factorial = new Factorial(5L);
		ExecutorService es = Executors.newSingleThreadExecutor();
		//It will not return value immediately..
		//It will return promise and future
		Future<Long> futureLong = es.submit(factorial); //non-blocking
		
		es.shutdown();
		
		System.out.println(futureLong.get());	//blocking
	}
}
