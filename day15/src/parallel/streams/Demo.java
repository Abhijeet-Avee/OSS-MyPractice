package parallel.streams;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class Demo {

	public static void main(String[] args) {
		
		// gettting sum of 1 to 1_000_000==>500000500000
	long start=System.currentTimeMillis();
//	
//		long sum = 0;
//		for (long i = 0; i <= 1_000_000; i++) {
//			sum += i;
//		}
		long end=System.currentTimeMillis();
//		System.out.println(sum);
//		System.out.println(end-start);

		// accomulation(sequececal stream ) vs reduction (work correctly for both || and
		// sequental)

		//AtomicInteger(optimitic locking) vs syn
		//final long sum2[] = new long[] { 0 };

		AtomicLong atomicLong=new AtomicLong(0);
		
		 start=System.currentTimeMillis();
		
		LongStream.rangeClosed(1, 1_000_0000)
		.parallel()
		.forEach(x -> atomicLong.addAndGet(x));

		 end=System.currentTimeMillis();
		
		System.out.println(atomicLong);
		
		System.out.println(end-start);

	}
}