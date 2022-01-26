package InnerClass;

class MyOuter {
	private int i=99;
	
	static void foofOuter(){
		
	}
	
	// used as helper class
	static class MyInner {
		void foof() {
			foofOuter();
			System.out.println("foof method");
		}
	}
}

public class NestedInnerClass {
	public static void main(String[] args) {
		MyOuter.MyInner in = new MyOuter.MyInner();
		in.foof();
	}
}
