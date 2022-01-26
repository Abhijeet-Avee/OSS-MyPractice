package day3;

//import java.util.Collections;
//import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		Inventory inventory = new Inventory("YE12Yam");
		Product product = new Product(12,"struts",5000,102);
		Product product2 = new Product(22,"ptruts",8000,202);
		
		inventory.addProduct(product);
		inventory.addProduct(product2);
		
		inventory.printInventoryDetails();
		inventory.procurment(12, 100);
		inventory.issue(12, 400);
		inventory.printInventoryDetails();
		
//		LinkedList<String> list = new LinkedList<String>();
//		list.add("ram");
//		list.add("suman");
//
//		Collections.sort(list);
//		
//		for(String data: list) {
//			System.out.println(data);
//		}
//		iterator can also be used for printing
//		System.out.println(list);
//		String data = list.get(1); //O(N)
//		System.out.println(data);
	}
}
