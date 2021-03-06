package sinlgeton.dp.issues;

//Singleton : Class loading -> Object creation : lazy v/s eager

//EAGER INSTANTION
//PROBLEM: There's no guarantee that object created in advance will be used
// or not. So problem is making object in advance..
class Singleton1{
	private static Singleton1 singleton1 = new Singleton1();
	private Singleton1() {}
	
	public static Singleton1 getSingleton1() {
		return singleton1;
	}
}

public class SingletonDP1 {
	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getSingleton1(); 
		Singleton1 singleton2 = Singleton1.getSingleton1();
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
