package veera.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 3,2 };
		for (int i = 1, j = 0; i < arr.length; i++) {
			int temp = arr[i];
			for (j = i; j > 0 && temp < arr[j - 1]; j--) {
				arr[j] = arr[j - 1];
				System.out.println(temp + "-value of arr[" + j + "]=" + arr[j] + " . arr[" + (j - 1) + "]=" + arr[j - 1]);
			}
			arr[j] = temp;
			System.out.println("----> i-" + i + " value-" + arr[i] + " .. value->" + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

}
