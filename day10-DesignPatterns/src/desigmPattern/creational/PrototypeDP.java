package desigmPattern.creational;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee implements Cloneable{
	private Integer id;
	private String name;
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {}
	public Employee(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	//By default, shallow copying for date Object since java makes only one
	//copy of the date Object..
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//We can also do serialization and deserialization
		//We need to do deep copy
		Employee cloneObject = (Employee) super.clone();
		cloneObject.date = (Date) date.clone();
		return cloneObject;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", date=").append(date)
				.append("]");
		return builder.toString();
	}	
}

public class PrototypeDP {
	public static void main(String[] args) throws CloneNotSupportedException, ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = dateFormat.parse("21/11/1978");
		
		Employee employee = new Employee(121,"raj",date);
		Employee employeeClone = (Employee) employee.clone();
		
		//DEEP COPYING
		System.out.println("----before change----");
		System.out.println(employee+" : "+employee.hashCode());
		System.out.println(employeeClone+ ":"+ employeeClone.hashCode());
		System.out.println("---after change----");
		employee.setName("abhi");
		employee.getDate().setDate(10);

		//Clone doesn't reflect changes done manually after cloning the object
		//by customizing the clone() method,
		//earlier since java made only object of Data[mutable] and shared the
		//object among both hence changes done were reflecting.
		System.out.println(employee+" : "+employee.hashCode());
		System.out.println(employeeClone+ ":"+ employeeClone.hashCode());
				
	}
	
}
