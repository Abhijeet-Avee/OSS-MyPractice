package com.java8.features;

//u should not consider the methods of Object class ?

@FunctionalInterface
interface MyFI{
	 public void foof();
	 public String toString() ;
}

@FunctionalInterface
interface MyInterface{
	void foo();
	default void foo2() {
		System.out.println("foo2 default method");
	}
	static void fooStatic() {
		System.out.println("foo2 static method");
	}
	
}
public class FunctionalInterfaceSam{

	public static void main(String[] args) {
		//Why FI is special as they support something called lambda expression=> steam processing=> || processing
	}
}







