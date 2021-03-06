package sinlgeton.dp.issues;
//Lazy initialization holder class is the pattern v/s double locking
//Singleton design pattern is also referred to as [anti-pattern]
//Singleton should be avoided instead use some framework unless necessary

//APPROACH: Using volatile keyword with double lock checking
//PROBLEM: What if someone tries serailization to recreate object
//Since when deserializing constructor is not called, so we may get a 
//different object than received; different hashcode.

class Singleton6 {
	private static volatile Singleton6 singleton1 = null;

	private Singleton6() {
	}

	public static Singleton6 getSingleton6() {
		if (singleton1 == null) {
			if (singleton1 == null) {
				synchronized (Singleton6.class) {
					singleton1 = new Singleton6();
				}
			}
		}
		return singleton1;
	}
}

public class SingletonDP6 {
	public static void main(String[] args) {
		Singleton6 singleton1 = Singleton6.getSingleton6();
		Singleton6 singleton2 = Singleton6.getSingleton6();

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
