package reflection;
//CALLING PRIVATE CONSTRUCTOR USING REFLECTION
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyClass{
	private MyClass() {
		System.out.println("private constructor");
	}
}

public class PrivateConstructor {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("reflection.MyClass");
		
		//calling private constructor using reflection
		Constructor []constructors = class1.getDeclaredConstructors();
		constructors[0].setAccessible(true);	//make private constructor accessible
		
		MyClass ob = (MyClass) constructors[0].newInstance();
	}
}
