package demoGenerics;

class Val<T>{
	private T i;

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}
	
}

public class DemoTemplate {
	public static void main(String[] args) {
		Val<Integer> val = new Val<Integer>();
		Val<Double> val2 = new Val<Double>();
		
	}
}
