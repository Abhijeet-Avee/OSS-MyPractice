package advance.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
//RecursiveTask vs RecursiveAction
class SearchTask extends RecursiveTask<Integer> {

	int arr[];
	int start, end, searchElement;

	public SearchTask(int[] arr, int start, int end, int searchElement) {
		this.arr = arr;
		this.start = start;
		this.end = end;
		this.searchElement = searchElement;
	}

	@Override
	protected Integer compute() {
		int size = end - start + 1;
		if (size > 3) {
			int mid = (end + start) / 2;
			SearchTask task1 = new SearchTask(arr, start, mid, searchElement);
			SearchTask task2 = new SearchTask(arr, mid + 1, end, searchElement);
			task1.fork();
			task2.fork();
			int result = task1.join() + task2.join();
			return result;
		}
		return processSearch();
	}

	Integer processSearch() {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (arr[i] == searchElement) {
				count++;
			}
		}
		return count;
	}

}

public class ForkandJoinDemo {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,6,8,6,6,12,6};
		int searchElement= 6;
		int start=0;
		int end= arr.length-1;
		ForkJoinPool pool=ForkJoinPool.commonPool();
		
		SearchTask task=new SearchTask(arr, start, end, searchElement);
		
		int result =pool.invoke(task);
		
		System.out.println(result);
		
		
	}
}




