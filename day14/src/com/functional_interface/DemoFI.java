package com.functional_interface;

interface MyInterface{
	void foo();
	default void fooDefault() {
		System.out.println("foo default of MyInterface");
	}
	
	public static void fooStatic() {
		System.out.println("foo static of MyInterface");
	}
}
 class MyClass implements MyInterface{

	@Override
	public void foo() {
		System.out.println("foo method is overriden");
	}
	
}

public class DemoFI{

	public static void main(String[] args) {
		
		MyInterface interface1=new MyClass();
		interface1.fooDefault();
		
		//interface1.fooStatic();
		
		MyInterface.fooStatic();
		
		//Interface evolution: default method inside an interface
		//						static method inside an interface
		
		//What is functional interface?
		
		/*
		 * What is functional interface?
		 * @FunctionalInterface
		 * Interface and diamond problem and solution
		 * Interface evolution: default method , static method examples
		 */
	}
}
