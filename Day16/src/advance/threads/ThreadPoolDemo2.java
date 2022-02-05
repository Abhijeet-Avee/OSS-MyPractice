package advance.threads;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//callable vs runnable 
//5-> 120
class Factorial implements Callable<Long> {

	long x;

	public Factorial(long x) {
		this.x = x;
	}

	@Override
	public Long call() throws Exception {

		long result = 1;
		if (x < 1)
			throw new IllegalArgumentException();
		else if (x == 1)
			return 1L;
		else {
			for (long l = 2; l <= x; l++) {
				result = result * l;
			}
		}
		return result;
	}

}

public class ThreadPoolDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Future<Long>> list = new ArrayList<Future<Long>>();

		ExecutorService service = Executors.newSingleThreadExecutor();

		for (int i = 0; i < 10; i++) {

			Random random = new Random();

			Callable<Long> task = new Factorial(random.nextInt(5) + 1);// 1 to 10
			Future<Long> future = service.submit(task);

			list.add(future);
		}

		Iterator<Future<Long>> it = list.iterator();
		// ? f.isDone()
		while (it.hasNext()) {
			Future<Long> f = it.next();

			System.out.println(f.get());
			it.remove();

		}

		service.shutdown();
		System.out.println("-----------");

	}

}