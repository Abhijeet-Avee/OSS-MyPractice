package com.functional_interface;

//functional interface: SAM

@FunctionalInterface
interface MyInn {
	void foo();

	// public String toString();

	default void barDefault() {
		System.out.println("it is a default method...");
	}

	static void barStatic() {
		System.out.println("it is a static method...");
	}
}

public class DemoFI2 {

	public static void main(String[] args) {
		// Functional interface can be written using lambda expression

		// ref==> java object
//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("job of the threads..");
//			}
//		};

		// ref=> piece of code
		Runnable runnable = () -> System.out.println("job of the threads..");
		// piece of code can be passed inside a method.. higher order function of java
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
