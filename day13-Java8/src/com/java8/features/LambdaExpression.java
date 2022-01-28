package com.java8.features;

import java.util.*;

//lambda v/s anonymous inner class
public class LambdaExpression{

	public static void main(String[] args) {

//		Comparator<Employee> comparator2=new Comparator<Employee>() {
//			
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return Double.compare(o2.getSalary(), o1.getSalary());
//			}
//		};
//		

//		Comparator<Employee> comparator2 = (Employee o1, Employee o2) ->{
//				return Double.compare(o2.getSalary(), o1.getSalary());
//			
//		};

	
//		Comparator<Employee> comparator2 = ( o1,  o2) ->{
//			return Double.compare(o2.getSalary(), o1.getSalary());
//		
//	};
	
		
		Comparator<Employee> comparator2 = ( o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary());
		
	
		Comparator<Employee> comparator3=Comparator.comparing(Employee::getSalary)
				.thenComparing(Employee::getName);
		
		
		// SAM==> lambda expression
		Comparator<String> comparator = (o1, o2) -> o2.compareTo(o1);

		List<String> list = new ArrayList<String>();
		list.add("foo");
		list.add("apple");
		list.add("aman");
		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));

		System.out.println(list);

		// Function pointer

		// anonymous inner class v/s anonymous

		Runnable runnable2 = () -> {
			System.out.println("job of the thread..");
			System.out.println("bye");
		};

		runnable2.run();

		// Runnable runnable = () -> System.out.println("job of the thread..");

		// runnable2.run();

//	
//		
//		Thread thread=new Thread(runnable2);
//		
//		Thread thread2=new Thread(()-> System.out.println("hi"));

//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//					System.out.println("job of the thread..");
//			}
//		};

	}
}