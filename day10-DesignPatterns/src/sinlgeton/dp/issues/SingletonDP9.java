package sinlgeton.dp.issues;

//APPROACH: If someone uses Reflection to access our private constructor
//to create a new object and break my code.. we can throw an exception using
//IllegalStateException to prevent it from breaking the singleton.

//PROBLEM: Singleton design pattern can still be broken using multiple class loaders
//existing in the same application. Each class loader may load its copy of class in it.


import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton9 implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singleton9 singleton1 = null;

	private Singleton9() {
		if(singleton1!=null) {
			throw new IllegalStateException();
		}
	}

	public static Singleton9 getSingleton9() {
		if (singleton1 == null) {
			if (singleton1 == null) {
				synchronized (Singleton9.class) {
					singleton1 = new Singleton9();
				}
			}
		}
		return singleton1;
	}

	private Object readResolve() {
		return singleton1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton1;
	}
}

public class SingletonDP9 {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton9 singleton9 = Singleton9.getSingleton9();
		System.out.println(singleton9.hashCode());
		
		// Dynamic class loading
		Class class1 = Class.forName("sinlgeton.dp.issues.Singleton9");
		Constructor[] constructors = class1.getDeclaredConstructors();
		//Making private constructor accessible
		constructors[0].setAccessible(true);
		Singleton9 singleton2 = (Singleton9) constructors[0].newInstance();
		System.out.println(singleton2.hashCode());
	}
}
