package desigmPattern.creational;

//Factory design pattern is used to hide the complexity of object creation


import java.util.Scanner;

interface Shape{
	public void draw();
}
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("It is a Circle");
	}
}
class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("It is a Rectangle");
	}
}
class Triangle implements Shape{
	@Override
	public void draw() {
		System.out.println("It is a Triangle");
	}
}
// SIMPLE FACTORY DESIGN 
class ShapeFactory{
	public static Shape getShape(String choice) {
		Shape shape = null;
		if(choice.equals("circle")) {
			shape = new Circle();
		}
		else if(choice.equals("triangle")) {
			shape = new Triangle();
		}
		if(choice.equals("rectangle")) {
			shape = new Rectangle();
		}
		return shape;
	}
}
public class FactoryDP {
	public static void main(String[] args) {
		Shape shape =null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		String choice = scanner.nextLine();
		shape = ShapeFactory.getShape(choice);
		shape.draw();
	}
}
