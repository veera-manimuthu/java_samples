package java_samples.java.arr;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeroInFixedArray {

	public static void main(String[] args) {
		System.out.println("Input");
		int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };// o/p - 1,0,0,2,3,0,0,4]
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Using Q");
		duplicateZerosUsingQ(arr);
		
		System.out.println();
		System.out.println("Input");
		int narr[]  = { 1, 0, 2, 3, 0, 4, 5, 0 };// o/p - 1,0,0,2,3,0,0,4]
		for (int i = 0; i < narr.length; i++) {
			System.out.print(narr[i] + " ");
		}
		System.out.println();
		usingOnlyArray(narr);
	}

	private static void usingOnlyArray(int arr[]) {
		int res[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && j < arr.length - 1) {
				res[j + 1] = 0;
				j += 2;
			} else if (j < arr.length) {
				res[j] = arr[i];
				j++;
			}

		}
		
		for(int i = 0; i < res.length; i++) {
            arr[i] = res[i];
            System.out.print(arr[i] + " ");
        }
	}

	private static void duplicateZerosUsingQ(int[] arr) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				queue.add(0);
				queue.add(0);
			} else {
				queue.add(arr[i]);
			}
			Integer val = queue.poll();
			arr[i] = val;
			System.out.print(arr[i] + " ");
			
		}

	}

	/*
	 * Insert in middle
	 * 
	 * for
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
