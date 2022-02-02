package parallel.streams;

import java.util.stream.LongStream;

public class DemoUsingParallelStream {

	public static void main(String[] args) {

		// gettting sum of 1 to 1_000_000==>500000500000
		long start = System.currentTimeMillis();
//	
		
		//F and Join 
		long sum=LongStream.rangeClosed(1, 1_000_000)
				.parallel()
				.reduce(0, (x, y)->  x+y);
		
		System.out.println(sum);
		
		long end = System.currentTimeMillis();

		
		System.out.println(end - start);

	}
}