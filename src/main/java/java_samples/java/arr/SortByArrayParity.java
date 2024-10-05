package java_samples.java.arr;

import java.util.Arrays;

public class SortByArrayParity {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4 };
		System.out.println(Arrays.toString(sortArrayByParity(arr)));
	}

	public static int[] sortArrayByParity(int[] nums) {

		int length = nums.length;
		int valArrIdx = 0;
		int[] res = new int[length];

		for (int i = 0; i < length; i++) {
			if (nums[i] % 2 == 0) {
				res[valArrIdx] = nums[i];
				valArrIdx++;
			}
		}
		for (int i = 0; i < length && valArrIdx < length; i++) {
			if (nums[i] % 2 != 0) {
				res[valArrIdx] = nums[i];
				valArrIdx++;
			}
		}
		return res;
	}
}
