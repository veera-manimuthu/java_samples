package veera.dsa.sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 2, 7 };

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
