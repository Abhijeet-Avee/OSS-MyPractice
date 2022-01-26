package com.empapp.web.controller;

import java.util.List;

import com.empapp.model.persistence.Employee;
import com.empapp.model.service.EmployeeService;
import com.empapp.model.service.EmployeeServiceImpl;

public class EmployeeAppTester {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		System.out.println("Printing all records..");
		printAllEmployees(employeeService);
		
		System.out.println("Add a new employee");
		Employee employee = new Employee("Yash","Delhi","Engineer",34000);
		employeeService.addEmployee(employee);
		
		System.out.println("Printing all employee after change");
		printAllEmployees(employeeService);
	}

	private static void printAllEmployees(EmployeeService employeeService) {
		List<Employee> employees = employeeService.getAll();
		for(Employee employee: employees) {
			System.out.println(employee);
		}
	}
}
