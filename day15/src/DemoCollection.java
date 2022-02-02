//How to make list thread-safe??

import java.util.*;

public class DemoCollection {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		//Poor performance
		//List<String> list2= Collections.synchronizedList(list);
		
		List<String> list2=Collections.unmodifiableList(list);
		list2.add("foo");
		
		
	}

}