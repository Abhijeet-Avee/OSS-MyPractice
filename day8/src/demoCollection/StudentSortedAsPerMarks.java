package demoCollection;

import java.util.Comparator;

public class StudentSortedAsPerMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o2.getMarks(), o1.getMarks());
	}
	
}
