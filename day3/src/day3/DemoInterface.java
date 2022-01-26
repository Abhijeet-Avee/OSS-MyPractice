package day3;

interface A{
	public static final int i=7;
	public abstract void foo();	
}

interface B{
	public static final int i=77;
	public abstract void foo();
}

class C implements A,B{
	
	@Override
	public void foo() {
		System.out.println(B.i);
	}
}

public class DemoInterface {
	public static void main(String[] args) {
		
	}
}
