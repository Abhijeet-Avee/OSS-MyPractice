package Collections;

//Important for Examination

import java.util.*;
import java.io.*;
public class EmployeeApp {
	private List<Employee> employees=new ArrayList<Employee>();
	
	public EmployeeApp() {
		init();
	}

	public void printAllSortedAsPerId() {
			//sorting logic
		//using comparable defined in Employee Class
		Collections.sort(employees);
	}
	
	public void printAllSortedAsPerName() {
		//sorting logic
		//using comparator defined in Employee Class
		Collections.sort(employees, new EmployeeSortingAsPerName());
}
	
	public void printAll() {
		Iterator<Employee> it=employees.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	private void init() {
		Employee emp=null;
		//to read the file make token of each line and put the records in the arraylist
		try {
			BufferedReader br=new BufferedReader(new FileReader("employee.txt"));
			String line=null;
			while((line=br.readLine())!=null) {
				String []tokens=line.split(":");
				emp=new Employee(Integer.parseInt(tokens[0]), 
						tokens[1], tokens[2], Double.parseDouble(tokens[3]));
				employees.add(emp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
