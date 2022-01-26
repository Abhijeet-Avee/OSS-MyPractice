package Collections;

import java.util.*;
// COMPARABLE vs COMPARATOR
// comparable: natural sort
//comparator: multiple sorting sequences
public class SortingUserDefineObject {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(123,"abhi","delhi",2000.00));
		employee.add(new Employee(231,"jeet","patna",5000.00));
		employee.add(new Employee(245,"ravi","noida",12000.00));
		employee.add(new Employee(321,"yash","delhi",2200.00));
		
		System.out.println("-----Printing as it is-----");
		printEmployee(employee);
		
		//Using Comparable 
		Collections.sort(employee);
		System.out.println("sorted as per id");
		printEmployee(employee);
		
		//Using Comparator - EmployeeSortingAsPerName
		System.out.println("Sorted as per name");
		Collections.sort(employee,new EmployeeSortingAsPerName());
		printEmployee(employee);
		
		//Using Comparator - EmployeeSortingAsPerCity
		System.out.println("Sorted as per city");
		Collections.sort(employee, new EmployeeSortingAsPerCity());
		printEmployee(employee);
	}

	private static void printEmployee(List<Employee> employee) {
		Iterator<Employee> it = employee.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
