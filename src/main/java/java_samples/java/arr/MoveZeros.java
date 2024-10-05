package java_samples.java.arr;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 3, 12 };
		moveZeroes(arr);
	}
	public static void moveZeroes(int[] nums) {
		if (nums.length <= 1) return;
		int valArrIdx = 0; 		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[valArrIdx] = nums[i];
				valArrIdx++;
			} else {
				nums[length - 1] = nums[i];
				length--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
