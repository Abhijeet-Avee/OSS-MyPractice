package Immutable;
//Creating Immutable Object

//Make class as final and data as final too
//Don't provide setters

import java.util.Arrays;

final class MyImmutable {
	private final int i;
	private final int arr[];

	public MyImmutable(int i, int arr[]) {
		this.i = i;
		//this.arr = arr; //Not a good code, original array can be changed and hence the content within
		this.arr = Arrays.copyOf(arr, arr.length); // make copy of the array
	}

	public int getI() {
		return i;
	}

	public int[] getArr() {
		//return a copy of the array
		// if we return arr, then reference arr can be compromised, array content can be changed
		//hence immutability can't be achieved
		//always return a copy of array
		return Arrays.copyOf(arr, arr.length);
	}

	public void print() {
		System.out.println("i: " + i);
		System.out.println("arr: ");
		for (int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
}

public class demoImmutableObj {
	public static void main(String[] args) {
		int i = 66;
		int arr[] = { 2, 3, 4 };
		MyImmutable immutable = new MyImmutable(i, arr);
		// System.out.println(immutable.getI());
		immutable.print();
		arr[1] = 100;

		System.out.println("-----------------");
		immutable.print();
	}
}
