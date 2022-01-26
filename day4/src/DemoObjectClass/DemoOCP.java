package DemoObjectClass;
//OPEN CLOSED PRINCIPLE
//process the geometry shape: Triangle, Circle, Square

//Design as per interface solves the modification problem by allowing to extend
abstract class Shape{
	public abstract void getArea();
}

class Triangle extends Shape{
	public void getArea() {
		System.out.println("I am Triangle");
	}
}

class Circle extends Shape{
	public void getArea() {
		System.out.println("I am Circle");
	}
}

class ShapeProcessor{
	public void process(Shape shape) {
		shape.getArea();
	}
}

public class DemoOCP {
	public static void main(String[] args) {
		
	}
}
