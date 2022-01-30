package com.optional;

import java.util.Optional;
import java.util.function.Supplier;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */

public class DemoOptional {

	public static void main(String[] args) {
		
		//What is Optional : class in java 8 used to deal with null in better way
		
		EmployeeService employeeService=new EmployeeService();
		Optional<Emp> empOpt=employeeService.getById(40);
		
		String name = empOpt
				.map(emp-> emp.getName())
				.orElse("name not found");
		
		System.out.println(name);
		//Emp emp2=empOpt.orElseThrow(EmpNotFoundEx::new);
		
		//I want to print the name of the emp if there otherwise i want to print emp not found
		

	}
}





