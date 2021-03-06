package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
		
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class demoReflection {
	public static void main(String[] args) throws ClassNotFoundException {
		//class loading static vs dynamic
		//static loading
		Employee employee = new Employee(1,"raj");
		//dynamic loading
		//first method
		Class class1 = Class.forName("reflection.Employee");
		//second method
		Class class2 = employee.getClass();
		//third method
		Class class3 = Employee.class;
		Method[] methods = class1.getDeclaredMethods();
		//Method[] methods = class1.getMethods();
		for(Method m: methods) {
			System.out.println(m.getName()+": "+m.getModifiers()+": "+Modifier.toString(m.getModifiers()));
		}	
		
		Constructor [] constructors = class1.getConstructors();
		for(Constructor c: constructors) {
			System.out.println(c.getName());
		}
	}
}
