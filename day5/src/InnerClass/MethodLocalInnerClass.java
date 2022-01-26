package InnerClass;

class A {
	public void foo() {
		//Method local inner class
		class B {
			void fooB() {
				System.out.println("Inner method..");
			}
		}
		B b = new B();
		b.fooB();
	}
}

public class MethodLocalInnerClass {
	public static void main(String[] args) {
		A a=new A();
		a.foo();
	}
}
