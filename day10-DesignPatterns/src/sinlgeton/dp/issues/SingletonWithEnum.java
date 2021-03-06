package sinlgeton.dp.issues;

import java.io.Serializable;

/**
 * Enum is better choice for singleton design pattern but still its a misuse of
 * enum concept Enum is by default singleton. Weakness: Eager instantiation
 * implementation only; Also not much flexible
 * To conclude, we can say that singleton design pattern can be implemented by Enum
 **/

enum MySingleton {
	INSTANCE;
	//
}

class Singleton10 implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singleton10 singleton1 = null;

	private Singleton10() {
		if (singleton1 != null) {
			throw new IllegalStateException();
		}
	}

	public static Singleton10 getSingleton10() {
		if (singleton1 == null) {
			if (singleton1 == null) {
				synchronized (Singleton10.class) {
					singleton1 = new Singleton10();
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

public class SingletonWithEnum {
	public static void main(String[] args) {
		MySingleton singletonEnum = MySingleton.INSTANCE;
		System.out.println(singletonEnum.hashCode());
		
		MySingleton singletonEnum2 = MySingleton.INSTANCE;
		System.out.println(singletonEnum2.hashCode());
	}
}
