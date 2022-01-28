package com.java8.features;

import java.util.function.Predicate;

public class PredicateJava8{
	
	public static void main(String[] args) {
		
		Predicate<Employee>predicate3= e-> e.getSalary()>100000;
		
	
		Predicate<String> predicate2= t->  t.contains("raj");
		
		
		Predicate<Integer> predicate= t -> t%2==0;
			
		System.out.println(predicate.test(34));
		
	}

}