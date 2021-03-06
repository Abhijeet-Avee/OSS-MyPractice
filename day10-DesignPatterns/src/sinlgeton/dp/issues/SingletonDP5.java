package sinlgeton.dp.issues;

//APPROACH: Double lock checking technique 
//PROBLEM: Thread t1 and t2 access the method simultaneously where
//both threads are on different CPU's..
/**In a multi-threaded environment where the threads operate on non-volatile
 * variables, each thread may copy variables from main memory into a CPU cache
 * while working on them for performance reasons. If your computer contains
 * more than one CPU, each thread may run on a different CPU. Thus, each
 * thread may copy the variable into the CPU cache of different CPUs.
 * Hence, there might be a possibility where more than one object get created.
 * **/
class Singleton5 {
	private static Singleton5 singleton1 = null;

	private Singleton5() {
	}

	public static Singleton5 getSingleton5() {
		if (singleton1 == null) {
			if(singleton1 == null) {
				synchronized (Singleton5.class) {
					singleton1 = new Singleton5();
				}
			}
		}
		return singleton1;
	}
}

public class SingletonDP5 {
	public static void main(String[] args) {
		Singleton5 singleton1 = Singleton5.getSingleton5();
		Singleton5 singleton2 = Singleton5.getSingleton5();

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
