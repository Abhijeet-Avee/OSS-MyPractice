package demoCollection;

import java.util.Map.Entry;
import java.util.*;

public class DemoCollection {
	public static void main(String[] args) {
		// List,set,map
		Map<String, Integer> records = new HashMap<>();
		records.put("yash", 49);
		records.put("abhi", 59);
		records.put("yashavee", 50);

		// Performance is not good because of double iteration
		// One for key and another for value
		Set<String> keySet = records.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + records.get(key));
		}

		//EntrySet is better than KeySet
		Set<Entry<String, Integer>> entrySet = records.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
