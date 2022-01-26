package day3;

public class WrapperDemo {
	public static void main(String[] args) {
		//In java version 1.4
		int i=9;
		Integer integer = new Integer(1);
		System.out.println(integer.intValue());
		
		Double doub = new Double(5.0);
		System.out.println(doub.doubleValue());
		
		//From Java 1.5 onwards, we have autoboxing and unboxing
		Integer it = i;
		System.out.println(it);
	}
}
