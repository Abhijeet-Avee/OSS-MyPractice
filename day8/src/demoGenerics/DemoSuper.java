package demoGenerics;

import java.util.*;
class Animal{
	void sound() {
		System.out.println("dont know");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("meou...");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("bho bho");
	}
}
class CostlyDog extends Dog{
	void sound() {
		System.out.println("bho bho stylilsh");
	}
}


public class DemoSuper {

	public static void main(String[] args) {
		List<Dog> list=new ArrayList<Dog>();
		list.add(new CostlyDog());
		list.add(new Dog());
		
		changeIt(list);
	}

	 static void changeIt(List<? super Dog> list) {
		list.add(new CostlyDog());
		//Cannot iterate over this
		//		for(Dog dog: list) {
//			dog.sound();
//		}
	}
}




