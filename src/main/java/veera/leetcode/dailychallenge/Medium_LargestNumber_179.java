package veera.leetcode.dailychallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Medium_LargestNumber_179 {

	public static void main(String args[]) {
		int a[] = { 1, 2, 3 };

		int result = 1;
		for (int i = a.length; i > 0; i--) {
			result = result * i;
		}

		System.out.println(result);
		 String val = "";
		for (int i = a.length; i > 0; i--) {
//			val = String.valueOf(a[i]);
//			System.out.print(i + " ");
		} 
		int count = 0;
		for (int i=0; count<result; count++) {
			String value = "";
			int j;
			for (j=i; j<a.length; j++) {
				value = value + j;
			}
//			System.out.println(value);
			for (int k = i-1; k>=0; k--) {
				value = value + k;
			}
			System.out.println(value);
//			int currVal = a[i];
		}
//		System.out.println(value);
	}

	public static void main(String[] args, double k) {

		int a[] = { 1, 2, 3 };

		Integer ab[] = Arrays.stream(a).boxed().collect(Collectors.toList()).toArray(new Integer[0]);

		for (Integer a1 : ab) {
//			System.out.println(a1);
		}

		Integer arr[] = { 3, 30, 34, 5, 9 };

		Arrays.sort(arr, (o1, o2) -> Integer.remainderUnsigned(o1, 10) > Integer.remainderUnsigned(o2, 10) ? -1 : 1);

		System.out.println(Arrays.toString(arr));

		System.out.println("Largest Number-->" + sampleTestin(arr)); //largestNumber(arr));

		Integer arr1[] = { 10, 2 };

//		Arrays.sort(arr1, (o1, o2) -> Integer.remainderUnsigned(o1, 10) > Integer.remainderUnsigned(o2, 10) ? -1 : 1);

//		System.out.println("Largest Number-->" + largestNumber(arr1));

		Integer arr2[] = { 34323, 3432 };

//		Arrays.sort(arr2, (o1, o2) -> Integer.remainderUnsigned(o1, 10) > Integer.remainderUnsigned(o2, 10) ? -1 : 1);

//		System.out.println(Arrays.toString(arr2));

//		System.out.println("Largest Number-->" + largestNumber(arr2));

	}

	public static String largestNumber(Integer[] nums) {
		if (nums.length == 1) {
			return String.valueOf(nums[0]);
		}
		String largestNumber = "";
		for (int i = 0; i < nums.length; i++) {
			String val;
			largestNumber = largestNumber.equals("") ? "0" : largestNumber;
			val = String.valueOf(nums[i]);

			for (int j = 0; j < nums.length; j++) {
				if (j == i) {
					continue;
				}

				val = val + nums[j];
				System.out.println("val->" + val);
				if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
					largestNumber = val;
				}
			}
			if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
				largestNumber = val;
			}
			System.out.println("Largest Number-->" + largestNumber);
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			String val;

			val = String.valueOf(nums[i]);

			for (int k = nums.length - 1; k >= 0; k--) {
				if (k == i) {
					continue;
				}

				val = val + nums[k];
				System.out.println("val->" + val);
				if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
					largestNumber = val;
				}
			}
			if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
				largestNumber = val;
			}
			System.out.println("Largest Number1-->" + largestNumber);
		}

		return largestNumber;
	}

	public static String sampleTestin(Integer[] nums) {

		if (nums.length == 1) {
			return String.valueOf(nums[0]);
		}
		String largestNumber = "";
		for (int i = 0; i < nums.length; i++) {
			String val;
			largestNumber = largestNumber.equals("") ? "0" : largestNumber;
			val = String.valueOf(nums[i]);

			for (int j = nums.length-1; j >= 0; j--) {
				if (j == i) {
					continue;
				}

				val = val + nums[j];
				System.out.println("val->" + val);
				if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
					largestNumber = val;
				}
			}
			if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
				largestNumber = val;
			}
			System.out.println("Largest Number-->" + largestNumber);
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			String val;

			val = String.valueOf(nums[i]);

			for (int k = 0; k < nums.length; k++) {
				if (k == i) {
					continue;
				}

				val = val + nums[k];
				System.out.println("val->" + val);
				if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
					largestNumber = val;
				}
			}
			if (Long.valueOf(val) > Long.valueOf(largestNumber)) {
				largestNumber = val;
			}
			System.out.println("Largest Number1-->" + largestNumber);
		}

		return largestNumber;

	}
}
