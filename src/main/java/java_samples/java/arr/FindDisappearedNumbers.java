package java_samples.java.arr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
/*Given an array nums of n integers where nums[i] is in the range [1, n], 
 return an array of all the integers in the range [1, n] that do not appear in nums.
 
 Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Input: nums = [1,1]
Output: [2]
 */
public class FindDisappearedNumbers {

	public static void main(String[] args) {
		int[] nums= {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
		
		int[] nums1= {1,1};
		System.out.println(findDisappearedNumbers(nums1));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        
        
		Set<Integer> distinctValues = new HashSet<>();
		
		for (Integer n : nums) {
			distinctValues.add(n);
		}
        
		for (int i = 1; i <= nums.length; i++) {
			if (!distinctValues.contains(i)) {
				disappearedNumbers.add(i);
			}
		}
        
        return disappearedNumbers;
    }

}
