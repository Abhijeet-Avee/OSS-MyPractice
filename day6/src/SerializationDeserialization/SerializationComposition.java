package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Contained class must also be serialized if containing class implements serializable
//class Collar implements Serializable {
//	int size;
//
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Collar [size=").append(size).append("]");
//		return builder.toString();
//	}
//
//}
// What if Collar is final? Make it transient but...
//How to make it persist if we want?? 
final class Collar{
	int size;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Collar [size=").append(size).append("]");
		return builder.toString();
	}

}

class Dog implements Serializable {
	private String dogName;
	private  transient Collar collar;

	public Dog(String dogName, Collar collar) {
		super();
		this.dogName = dogName;
		this.collar = collar;
	}
	//JVM will call this method to save data for final class Collar
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeInt(collar.size);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream ois) {	
		try {
			ois.defaultReadObject();
			collar = new Collar();
			collar.size = ois.readInt();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [dogName=").append(dogName).append(", collar=").append(collar).append("]");
		return builder.toString();
	}

}

public class SerializationComposition {
	public static void main(String[] args) {
		Collar collar = new Collar();
		collar.size = 42;
		Dog dog = new Dog("stonish", collar);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser.txt"));
			oos.writeObject(dog);
			oos.close();
			System.out.println("Serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream oos1 = new ObjectInputStream(new FileInputStream("ser.txt"));
			Dog dog1 = (Dog) oos1.readObject();
			System.out.println(dog1);
			oos1.close();
			System.out.println("Deserialized");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
