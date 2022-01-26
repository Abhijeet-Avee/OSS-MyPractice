package generics;

import java.util.*;

public class demoGenerics {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(66);
		list.add(31);
//		list.add("sasa");		// Generics is a type safety net
	
		//dont mix generics and non-generics code
		myStrangeMethod(list);
		int sum=0;
		for(Integer temp: list) {
			sum+=temp;
		}
		System.out.println(sum);
	}

	//never ever do this: mix generics and non-generics code
	static void myStrangeMethod(List list) {
		list.add("foo");
	}
}
