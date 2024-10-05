package java_samples.java.arr;

public class MaxConsecutive1 {

	public static void main(String[] args) {
		int nums[] = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
	//Input: nums = [1,0,1,1,0,1]==6
    //Output: 2
	private static int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int occur = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				occur = 0;
			} else if (nums[i] == 1) {
				occur++;
				result = Math.max(result, occur);
			}
		}
		return result;
	}

}
