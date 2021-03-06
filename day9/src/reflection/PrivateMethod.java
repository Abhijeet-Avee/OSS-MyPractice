package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Foo{
	public String welcome(String name) {
		return "welcome "+ name;
	}
}

public class PrivateMethod {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("reflection.Foo");
		Method method = class1.getMethod("welcome", String.class);
		
		Object ob = class1.newInstance();
		
		String output = (String) method.invoke(ob, "raj");
		System.out.println(output);
	}
}
