package demoGenerics;
import java.util.*;

import demoCollection.Student;

//<? extends xxx>
//<? super xxx>
//PECS - Producer Extend Consumer Super
public class GenericClass {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(44);
		list.add(4);
		list.add(404);
		
		List<Double> list2=new ArrayList<Double>();
		list2.add(404.00);
		list2.add(4.00);
		list2.add(404.7);
		
		List<Student> students=new ArrayList<>();
		
		students.add(new Student(12, "raj", 67));
		students.add(new Student(102, "ekta", 89));
		students.add(new Student(52, "vineet", 97));
		
		printIt(list);
		printIt(list2);
		printIt(students);
		
	}

	static void printIt(List<? extends Object> list) {
		for(Object temp: list) {
			System.out.println(temp);
		}
	}
	
	
}
