package HashMapvsHashTable;

import java.util.*;

public class HashMapvsHashTable {
	public static void main(String[] args) {
		Hashtable<String, Integer> map = new Hashtable<String,Integer>();
		map.put(null,55);	//doesn't allow null key or values
		map.put(null,66);
		System.out.println(map);
	}
}
