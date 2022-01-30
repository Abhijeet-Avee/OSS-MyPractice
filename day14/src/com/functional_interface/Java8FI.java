package com.functional_interface;

import java.util.function.BiPredicate;

public class Java8FI {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> p4=(a, b)-> a>b?true:false;
		//u want to return true if employee salary is greater then given double or else return false
		
		BiPredicate<Employee, Double> p5=(e, d)-> e.getSalary()>d?true:false;
		
		System.out.println(p5.test(new Employee(1	, "aman", "NY", 2000.00), 5000.00));
		
		
//		Predicate<Integer> p1= number -> number%2==0;
//		System.out.println(p1.test(44));
//		
//		Predicate<String>p2=name-> name.contains("raj");
//		System.out.println(p2.test("ekta"));
//		
//		//how to write a predicate for emp getting salary more then 1L
//		Predicate<Employee> p3=employee-> employee.getSalary()>100000;
//		System.out.println(p3.test(new Employee(1	, "aman", "NY", 2000)));
//		
		
		
		/*
		 * Predicate:	boolean test(T t);		used to do filter operation *
		 * Consumer:	void accept(T t);		used to consume the streams *
		 * Function:	R apply(T t);			used to convert something to somthing else*
		 * Supplier:	T get();				aka factory dp in java 8*
		 */
	}

}
