package java_samples.java.arr;

import java.util.Arrays;

public class ReplaceGreatestElementOnRightSide {

	public static void main(String[] args) {
		int arr[] = { 17, 18, 5, 4, 6, 1 };
		System.out.println(Arrays.toString(replaceElements(arr)));
	}

	public static int[] replaceElements(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				arr[i] = -1;
			} else {
				arr[i] = getGreatestValue(arr, i);
			}
		}

		return arr;
	}

	private static int getGreatestValue(int[] arr, int currIndex) {
		int greatestValue = -1;
		for (int i = currIndex + 1; i < arr.length; i++) {
			/*
			 * if (i==arr.length-1) { return -1; }
			 */

			if (greatestValue < arr[i]) {
				greatestValue = arr[i];
			}
		}
		return greatestValue;
	}
}
