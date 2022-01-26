package day2;

import java.util.Scanner;

abstract class Shape{
	private String color;
	public Shape(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	abstract public void getArea(double a);
}

class Square extends Shape{
	public Square(String color){
		super(color);
	}
	@Override
	public void getArea(double a) {
		System.out.println("Area of Square: "+(a*a));
	}
}

class Circle extends Shape{
	public Circle(String color){
		super(color);
	}
	@Override
	public void getArea(double r) {
		System.out.println("Area of Circle: "+(3.14*r*r));
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		System.out.println("Choose the shape: ");
		System.out.println("1. For Square 2. For Circle");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();
		Shape shape = null;
		if(choice == 1)
			shape = new Square("red");
		else if(choice == 2)
			shape = new Circle("blue");
		shape.getArea(4);
		System.out.println("Color is: "+ shape.getColor());
		scanner.close();
	}
}
