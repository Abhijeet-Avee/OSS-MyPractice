package com.functional_interface;

import java.util.*;

public class DemoFI3 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("ravi");
		names.add("rajat");
		names.add("sumit");
		names.add("anil");
	
		Comparator<String> comparator2=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Comparator<String> comparator=( o1,  o2)-> o2.compareTo(o1);
		
		//? //Comparator<String> comparator=Comparator.comparing();
		
		Collections.sort(names, ( o1,  o2)-> o2.compareTo(o1));
		
	}
}