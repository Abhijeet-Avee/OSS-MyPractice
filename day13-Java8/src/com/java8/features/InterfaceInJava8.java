package com.java8.features;

interface Foo{
	void foo();
	default  void fooDefault() {
		System.out.println("it is a defult method");
	}
	public static void fooStatic() {
		System.out.println("this is static method");
	}
}

class BarImpl implements Foo{

	@Override
	public void foo() {
		System.out.println("foo is overriden in barImpl");
	}
	
	public static void fooStatic() {
		System.out.println("this is static method of BarImpl" );
	}
}

abstract class FooImpl implements Foo{
	@Override
	public void foo() {
		System.out.println("foo is overriden in Fooimpl");
	}
	
	public abstract void fooDefault() ;
}
public class InterfaceInJava8{
	
	public static void main(String[] args) {
		
		Foo.fooStatic();
		
		Foo foo=new BarImpl();
		
		BarImpl.fooStatic();
		
		foo.fooDefault();
	}

}





