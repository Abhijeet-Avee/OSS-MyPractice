package sinlgeton.dp.issues;

//APPROACH: Using synchronized block to avoid performance cost. 
//PROBLEM: Multithreading issue; 
//Threads t1 and t2; t1,t2 calls the method simultaneously
// t1 gets singleton1 == null and t2 also gets singleton1 == null
// suppose t1 gets the lock and it creates the object.
// t2 still has singleton1 == null which will then again create the object
// when lock is received by t2. Hence , double objects created.
class Singleton4 {
	private static Singleton4 singleton1 = null;

	private Singleton4() {
	}

	public static Singleton4 getSingleton4() {
		if (singleton1 == null) {
			synchronized (Singleton4.class) {
				singleton1 = new Singleton4();
			}
		}
		return singleton1;
	}
}

public class SingletonDP4 {
	public static void main(String[] args) {
		Singleton4 singleton1 = Singleton4.getSingleton4();
		Singleton4 singleton2 = Singleton4.getSingleton4();

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
