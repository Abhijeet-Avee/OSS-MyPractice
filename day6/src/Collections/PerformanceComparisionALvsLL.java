package Collections;

import java.util.*;

public class PerformanceComparisionALvsLL {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		
		calculatePerformance(list);
	}

	 static void calculatePerformance(List<Integer> list) {
		 for(int i=0;i<1E5; i++) {
			 list.add(i);
		 }
		long start=System.currentTimeMillis();
		for(int i=0;i<1E5; i++) {
			 list.add(0,i);
		 }

		long end=System.currentTimeMillis();
		System.out.println("time taken: "+(end-start)+" ms");
	}

}
