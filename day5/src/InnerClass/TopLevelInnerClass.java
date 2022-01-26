package InnerClass;

class Outer{
	private int i=66;
	private static int iStatic=666;
	class Inner{
		private int i = 550;
		public void foo() {
			System.out.println(i);
			System.out.println(Outer.iStatic);	//accessing outer static
			System.out.println(Outer.this.i); 	//Inner class can access private outer class data
			System.out.println("Foo method ....");
		}
	}
	//NOTE: YOU CANNOT CREATE IT INSIDE A STATIC METHOD
	public void fooOuter(){
		Inner inner = new Inner();
		inner.foo();
	}
}

public class TopLevelInnerClass {
	public static void main(String[] args) {
		//You cannot have object of inner class without object of outer class
		Outer.Inner inner = new Outer().new Inner();
		//Outer outer = new Outer();
		//outer.fooOuter();
		inner.foo();
	}
}
