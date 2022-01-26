package queue;

import java.util.*;

public class demoPriorityQueue {
	public static void main(String[] args) {
		//PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			//Making max heap; by default it returns min heap
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
			
		});
		System.out.println(queue.isEmpty());
		
		queue.offer(100);
		queue.offer(-5);
		queue.offer(5);
		queue.offer(500);
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek());
		
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
	
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());	// will throw NosuchElementException
	
		//don't iterate like this; heap
//		Iterator<Integer> it = queue.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next()+"=>");
//		}
		
		//How to iterate through queue if you want data sorted
		//or copy queue and poll it
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
