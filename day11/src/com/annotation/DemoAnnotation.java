package com.annotation;
import java.util.*;
// in-build annotation and custom annotation
class A{
	void foo() {
		System.out.println("foo method of class A");
	}
	@Deprecated
	public void oldApi() {
		System.out.println("old api ....");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void usingCollection() {
		
		List l=new ArrayList();
		l.add("foo");
		System.out.println("old api ....");
		
	}
	
}

class B extends A{
	
	@Override
	void foo() {
		System.out.println("foo method of class B");
	}
}

public class DemoAnnotation {
	
	public static void main(String[] args) {
		B b=new B();
		//b.oldApi();
		//Date date=new Date(21, 11, 11);
		
		
	}

}