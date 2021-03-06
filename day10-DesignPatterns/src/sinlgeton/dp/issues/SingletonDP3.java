package sinlgeton.dp.issues;

//APPROACH: Making method synchronous using synchronized method
//PROBLEM: We needed lock for only once when the object was not created.
// After that we don't need any lock on the method, hence its waste to
//use synchronized method , because its costly performance wise.
//[LOCKING THE OBJECT TEMPLATE -> this]
class Singleton3 {
	private static Singleton3 singleton1 = null;

	private Singleton3() {
	}

	public synchronized static Singleton3 getSingleton3() {
		if (singleton1 == null)
			singleton1 = new Singleton3();
		return singleton1;
	}
}

public class SingletonDP3 {
	public static void main(String[] args) {
		Singleton3 singleton1 = Singleton3.getSingleton3(); 
		Singleton3 singleton2 = Singleton3.getSingleton3();
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
