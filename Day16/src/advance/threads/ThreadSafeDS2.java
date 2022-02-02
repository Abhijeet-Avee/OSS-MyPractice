package advance.threads;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeDS2 extends Thread{

	private static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		map.put("five","5");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// Thread Safe data structures
		//Vector<String> , hashtable => may throw ConcurrentModification exception
		//=> Fail fast [Vector] v/s Fail safe [ConcurrentHashMap, CopyOnWriteArrayList]
		
		map.put("one","1");
		map.put("two","2");
		map.put("three","3");
		map.put("four","4");
		
		ThreadSafeDS2 t = new ThreadSafeDS2();
		t.start();
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for(Entry<String,String> e: entrySet) {
			System.out.println(e.getKey()+ " : "+ e.getValue());
			try {
				Thread.sleep(100);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(map);
	}
}
