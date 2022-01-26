package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class UserDefinedObjects {
	public static void main(String[] args) {
		PriorityQueue<JobWork> queue = new PriorityQueue<>(
				new Comparator<JobWork>() {
					//Making max heap; by default it returns min heap
					@Override
					public int compare(JobWork o1, JobWork o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
					
				}
				);
		queue.offer(new JobWork(12,"making die of tyre",2));
		queue.offer(new JobWork(122,"making die of engine",2));
		queue.offer(new JobWork(121,"making die of headlight",5));
	
		System.out.println("-----------------");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
