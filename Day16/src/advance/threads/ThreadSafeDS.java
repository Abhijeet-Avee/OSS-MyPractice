package advance.threads;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeDS extends Thread{

	//private static Vector<String> list = new Vector<>();
	private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add("d");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// Thread Safe data structures
		//Vector<String> , hashtable => may throw ConcurrentModification exception
		//=> Fail fast [Vector] v/s Fail safe
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		ThreadSafeDS t = new ThreadSafeDS();
		t.start();
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(300);
		}
	}
}
