package sinlgeton.dp.issues;

//APPROACH: When implementing for Cloneable, we may override the clone method
// and return the object from it. Hence if someone tries to clone the object
// he receives the same object [same hashcode]

//PROBLEM: What if someone tries java Reflection on our class
//to create a new object and break your singleton

import java.io.Serializable;

class Singleton8 implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singleton8 singleton1 = null;

	private Singleton8() {
	}

	public static Singleton8 getSingleton8() {
		if (singleton1 == null) {
			if (singleton1 == null) {
				synchronized (Singleton8.class) {
					singleton1 = new Singleton8();
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

public class SingletonDP8 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton8 singleton1 = Singleton8.getSingleton8();
		System.out.println(singleton1.hashCode());
		
		Singleton8 singleton2 = (Singleton8) singleton1.clone();
		System.out.println(singleton2.hashCode());

	}
}
