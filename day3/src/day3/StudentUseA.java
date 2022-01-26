package day3;
//A student is writing exam using a pen

class Pen{
	private String color;
	
	public Pen(String color) {
		this.color=color;
	}
	public void mark() {
		System.out.println("Writing with pen..."+color);
	}
}

class Student{
	public void writeExam(Pen pen, String subject) {
		System.out.println("Writing "+subject+" paper....");
		pen.mark();
	}
}

public class StudentUseA {
	public static void main(String[] args) {
		Pen pen = new Pen("blue");
		Student student = new Student();
		student.writeExam(pen,"maths");
	}
}
