package com.java8.features;

interface A{
	int i=77;
	default void foo() {
		System.out.println("default foo() method of inteface A");
	}
	public static void foofStatic() {
		System.out.println("fooStatic of A");
	}
}

interface B{
	int i=88;
	default void foo() {
		System.out.println("default foo() method of inteface B");
		
	}
	public static void foofStatic() {
		System.out.println("fooStatic of A");
	}
}

class C implements A, B{

	@Override
	public void foo() {
		System.out.println(B.i);
		B.super.foo();
		A.foofStatic();
		
		B.foofStatic();
	}
	
}
public class InterfaceMultipleInheritance {
	
	public static void main(String[] args) {
		
	}

}
