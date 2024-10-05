package veera.dsa.searching;

import java.util.Arrays;

public class SearchingAlgm {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 9, 7, 4 };
		System.out.println("BinarySearch index-->" + callBinarySearch(arr, 9));
	}

	private static int callBinarySearch(int[] arr, int searchVal) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (searchVal == arr[middle]) {
				return middle;
			} else if (arr[middle] < searchVal) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}

		return -1;
	}

}
