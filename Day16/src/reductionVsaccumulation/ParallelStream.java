package reductionVsaccumulation;

import java.util.LongSummaryStatistics;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class ParallelStream {

	public static void main(String[] args) {
		long sum=0;
		for(long n=0;n<=1_000_000; n++) {
			sum+=n;
		}
		System.out.println(sum);
		//reduction and accumulation ...
		
		//accumulation : foreach
//		long sum2[]=new long[] {0L};
//		LongStream.rangeClosed(1, 1_000_000)
//		.parallel()
//		.forEach( x ->sum2[0]+=x);
//		
//		System.out.println(sum2[0]);
		
		//reduction
//		long sum3=LongStream.rangeClosed(1, 1_000_000)
//				.parallel()
//				.sum();
//				//.reduce(0, (x, y)-> x+y);
//		System.out.println(sum3);
		
		LongSummaryStatistics summaryStatistics = 
				LongStream.rangeClosed(1, 1_000_000)
				.parallel()
				.summaryStatistics();
		System.out.println(summaryStatistics.getAverage());
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.toString());
		
				//.reduce(0, (x, y)-> x+y);
		
		
	}
}