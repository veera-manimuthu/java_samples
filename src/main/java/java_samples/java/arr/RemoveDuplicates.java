package java_samples.java.arr;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 4, 1 };
		Arrays.sort(arr);
		System.out.println(arr.length);
		System.out.println("Original Array--> " + Arrays.toString(arr));

		int length = arr.length;

		for (int i = length - 2; i >= 0; i--) {
			if (arr[i] == arr[i + 1]) {
				for (int j = i+1; j < length; j++) {
					arr[j-1] = arr[j];
				}
				length--;
			}
		}

		System.out.println("Distinct Array--> " + Arrays.toString(arr));
		System.out.println(length);
	}

}
