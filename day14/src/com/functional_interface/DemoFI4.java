package com.functional_interface;

import java.util.*;

public class DemoFI4 {

	public static void main(String[] args) {
		List<Employee> names=new ArrayList<Employee>();
		
		names.add(new Employee(55, "raj", "noida", 67000.00));
		names.add(new Employee(18, "ajit", "delhi", 70000.00));
		names.add(new Employee(61, "ekta", "noida", 61000.00));
		names.add(new Employee(19, "suman", "chennai", 67900.00));
		
		Comparator<Employee> comparator=( o1,  o2)-> Double.compare(o2.getSalary(), o1.getSalary());
			
		Comparator<Employee> comparator2=Comparator.comparing(Employee::getSalary).reversed();
		
		
		Collections.sort(names, comparator);
		
		//-------------------iterator (java begining)------------------------
		Iterator<Employee> it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//-------------------enhace for loop:(java 5) syn suger on iterator-------------------
		for(Employee e: names) {
			System.out.println(e);
		}
		
		//-------------------using Steams (java 8)-------------------
		names.stream().forEach(e-> System.out.println(e));
	}
}





