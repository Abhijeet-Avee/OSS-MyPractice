package SerializationDeserialization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//instance control flow:
//if my base class is not serilizable but drived class is then
//ser will not fail but during de-ser java will do sothing called instance control flow
//ie defaut ctr of Foo class is called and instance varaible will get there default value 
//InvalidClassException if foo dont have default  ctr
class Foo{
	int i = 11;
	
	public Foo(int i) {
		this.i = i;
	}
}

class Bar extends Foo implements Serializable{
	int j=0;
	
	public Bar(int i, int j) {
		super(i);
		this.j = j;
	}
}
public class SerializationInheritance {

	public static void main(String[] args) {

		//ser
		
		try {
			ObjectOutputStream oos=new ObjectOutputStream
					(new FileOutputStream("/home/raj/Desktop/photo/inh.txt"));
			
			Bar bar=new Bar(2, 4);
			
			oos.writeObject(bar);
			System.out.println("Ser is done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//for reading
		
		try {
			ObjectInputStream ois=new ObjectInputStream
					(new FileInputStream("/home/raj/Desktop/photo/inh.txt"));
			
			System.out.println("rading it back");
			Bar bar=(Bar) ois.readObject();
			System.out.println(bar.i);
			System.out.println(bar.j);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}
	
}



