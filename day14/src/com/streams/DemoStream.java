package com.streams;

import java.util.stream.LongStream;

class Prime{
	public static boolean isPrime(long n) {
		boolean isPrimeNumber = true;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				isPrimeNumber = false;
		}
		return isPrimeNumber;
	}
}

public class DemoStream {
	public static void main(String[] args) {
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println(cores);
		
		long counter = 0;
		long start = System.currentTimeMillis();
		counter = LongStream.rangeClosed(1,10000)	//Stream - parallel processing
				.parallel()				//Fork & Join Framework => Java ?
				.filter(Prime::isPrime)
				.count();
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start));
		System.out.println(counter);
		
		/*
		 * 	Why java 8:
		 * 
		 * main motive of java 8 is declarative data processing using some features of functional programining
		 * 	java =oops + some feature of functional programming language
		 * 
		 *  functional programming(declarative data processing)
		 *  
		 *  data processing => data => collection
		 *  
		 *  	Collection
		 *  
		 *  	List		Set			Queue
		 *  
		 *  	Map
		 *  
		 *  HM	LHM		TM
		 * 
		 * 
		 * 	=> stream processing ===> lambda expression ==>
		 *  function interface ==> interface "evolution": default /static
		 */
		
		
		/*
		 * System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
		or
		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 DemoTakingAdvOfParallelProcessingwithOutPhd
		 */
	}
}
