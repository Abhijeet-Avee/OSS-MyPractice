package demoCollection;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Comparator;

public class DemoSet {
	public static void main(String[] args) {
//		Set<Student> students = new HashSet<Student>();
//		Set<Student> students = new LinkedHashSet<Student>();
//		Set<Student> students = new TreeSet<Student>(new StudentSortedAsPerMarks());
		Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1,Student s2) {
				return Integer.compare(s2.getMarks(),s1.getMarks());
			}
		});
		students.add(new Student(12,"raj",67));
		students.add(new Student(102,"ekta",89));
		students.add(new Student(55,"yash",77));
		
		boolean isThere = students.contains(new Student(12,"raj",67));
		System.out.println(isThere);
		
		for(Student student: students) {
			System.out.println(student);
		}
	}
}
