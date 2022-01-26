package Collections;

import java.util.*;
import java.util.Collections;

public class CollectionBasics {
	//Generics: java 5 ; Java 7(diamond op)
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		System.out.println(list);
		for(String st: list) {
			System.out.println(st);
		}
		Collections.sort(list);
		System.out.println("-----sorted result-------");
		for(String data: list) {
			System.out.println(data);
		}
		
		//Binary Search
		int index = Collections.binarySearch(list, "foo");
		System.out.println(index);
	}
}
