package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		
		//CRUD method with ListIterator
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			String data = it.next();
			if(data.equals("foo")) {
				it.set("goo");
			}
			if(data.equals("bar")) {
				it.remove();
			}
			if(data.equals("jar")) {
				it.add("tar");;
			}
		}
		//reset to head
		it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//[Iterator]iterate,delete,
		//[ListIterator]crud operation,
		//[Enumerator]old iterator
		//[Splititerator]
		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			it.remove();
//		}
//		System.out.println(list);
		
//		ListIterator<String> it = list.listIterator(list.size());
//		while(it.hasPrevious()) {
//			System.out.println(it.next());
//		}
		
//		Vector<String> list = new Vector<>();
//		list.add("foo");
//		list.add("bar");
//		list.add("jar");
//		
//		Enumeration<String> it = list.elements();
//		while(it.hasMoreElements()) {
//			System.out.println(it.nextElement());
//		}
		
	}
}
