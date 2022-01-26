package generics;

import java.util.*;

public class DemoQuestionMarkExtends {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(66);
		list.add(31);
		
		printList(list);
		
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(66.00);
		listDouble.add(31.7);
		
		printList(listDouble);
	}

	private static void printList(List<? extends Number> list) {
		for(Number temp: list) {
			System.out.println(temp);
		}
	}
}
