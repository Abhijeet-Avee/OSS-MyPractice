package sinlgeton.dp.issues;


//Approach: LAZY INSTANTION
//Problem: Concurrency issue; Multithreading
// Thread t1 and t2 may call the method simulatneously creating race condition
//Hence, creating two objects rather than one. Singleton fails..
class Singleton2{
	private static Singleton2 singleton1 = null;
	private Singleton2() {}
	public static Singleton2 getSingleton2() {
		if(singleton1 == null)
			singleton1 = new Singleton2();
		return singleton1;
	}
}

public class SingletonDP2 {
	public static void main(String[] args) {
		Singleton2 singleton1 = Singleton2.getSingleton2(); 
		Singleton2 singleton2 = Singleton2.getSingleton2();
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
