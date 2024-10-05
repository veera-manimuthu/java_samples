package veera.arr.twopointers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * https://leetcode.com/problems/squares-of-a-sorted-array/description/
 * 
 * Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
				Explanation: After squaring, the array becomes [16,1,0,9,100].
				After sorting, it becomes [0,1,9,16,100] 
				
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
 
 Follow up: Squaring each element and sorting the new array is very trivial, 
 could you find an O(n) solution using a different approach?
				*/
public class SquaresOfSortedArr {

	public static void main(String[] args) {

		int nums[] = { -4,-1,0,3,10 };
		int result[] = new int[nums.length];
		int resultIdx=nums.length-1;

		for (int left = 0, right = nums.length - 1; left <= right;) {
			int leftVal = nums[left] * nums[left];
			int rightVal = nums[right] * nums[right];
			if (leftVal >= rightVal) {
				result[resultIdx--] = leftVal;
				left++;
			} else if (leftVal < rightVal){
				result[resultIdx--] = rightVal;
				right--;
			}
		}
		
		System.out.println(Arrays.toString(result));

//		usingJava8(nums);
	}

	/*
	 * private static void usingJava8(int[] nums) { List<Integer> asList =
	 * Arrays.asList(-4, -1, 0, 3, 10).stream().map(n -> n *
	 * n).collect(Collectors.toList()); System.out.println(asList);
	 * 
	 * }
	 */

}
