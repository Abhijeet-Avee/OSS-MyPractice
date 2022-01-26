package sinlgeton.dp.issues;

//APPROACH: Using private Object readResolve() method to avoid
//deserialization at other end and simply returning the singleton object
//through the function, hence same hashCode will be generated at both ends.

//PROBLEM: What if someone tries to Clone our object and thus
// creating a copy of our object which violates the singleton principle

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton7 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singleton7 singleton1 = null;
	private Singleton7() {
	}

	public static Singleton7 getSingleton7() {
		if (singleton1 == null) {
			if (singleton1 == null) {
				synchronized (Singleton7.class) {
					singleton1 = new Singleton7();
				}
			}
		}
		return singleton1;
	}
	
	//If you have defined the readResolve method then java will not go for
	//deserialization, and will directly call the readResolve method.
	//Thus, same hashcode will be generated while deserialization.
	private Object readResolve() {
		return singleton1;
	}
	
}

public class SingletonDP7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Singleton7 singleton1 = Singleton7.getSingleton7();
		System.out.println(singleton1.hashCode());
		//Serialize
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo.txt"));
		oos.writeObject(singleton1);
		oos.close();
		//Deserialize
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.txt"));
		Singleton7 singleton2 = (Singleton7) ois.readObject();
		System.out.println(singleton2.hashCode());
		ois.close();
	}
}
