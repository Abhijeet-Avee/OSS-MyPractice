package IoandExceptions;
import static java.lang.Math.*;

//Circle
//1. Create a user defined Exception
class NegativeRadiusException extends Exception{
	public NegativeRadiusException(String message) {
		super(message);
	}
}

class Circle{
	private int radius;

	public Circle(int radius) throws NegativeRadiusException {
		if(radius<=0) {
			throw new NegativeRadiusException("Negative radius not allowed");
		}
		this.radius = radius;
	}
	
	public void printArea() {
		System.out.println(PI*radius*radius);
	}
}

public class CustomExceptions {
	public static void main(String[] args) {
		
		Circle circle;
		try {
			circle = new Circle(-2);
			circle.printArea();
		} catch (NegativeRadiusException e) {
			System.out.println(e.getMessage());
		}
	}
}
