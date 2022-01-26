package IoandExceptions;
import static java.lang.Math.*;

//Circle
//1. Create a user defined Exception
class NegativeRadiusException2 extends RuntimeException{
	public NegativeRadiusException2(String message) {
		super(message);
	}
}

class Circle2{
	private int radius;

	public Circle2(int radius){
		if(radius<=0) {
			throw new NegativeRadiusException2("Negative radius not allowed");
		}
		this.radius = radius;
	}
	
	public void printArea() {
		System.out.println(PI*radius*radius);
	}
}

public class CustomRuntimeException {
	public static void main(String[] args) {
		
		Circle2 circle;
		try {
			circle = new Circle2(-2);
			circle.printArea();
		} catch (NegativeRadiusException2 e) {
			System.out.println(e.getMessage());
		}
	}
}
