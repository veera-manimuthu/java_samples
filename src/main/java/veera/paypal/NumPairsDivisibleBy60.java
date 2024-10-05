package veera.paypal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/?envType=company&envId=paypal&favoriteSlug=paypal-thirty-days

/*Constraints:

	1 <= time.length <= 6 * 104
	1 <= time[i] <= 500
	
*/
public class NumPairsDivisibleBy60 {

	public static void main(String[] args) {
		int[] arr = { 30, 20, 150, 100, 40 };
//		System.out.println(numPairsDivisibleBy60(arr));
		System.out.println(numPairsDivisibleBy60Enhanced(arr));
		int[] arr1 = { 60, 60, 0, 180 };
//		System.out.println(numPairsDivisibleBy60Enhanced(arr1));

		int arr2[] = { 269, 230, 318, 468, 171, 158, 350, 60, 287, 27, 11, 384, 332, 267, 412, 478, 280, 303, 242, 378,
				129, 131, 164, 467, 345, 146, 264, 332, 276, 479, 284, 433, 117, 197, 430, 203, 100, 280, 145, 287, 91,
				157, 5, 475, 288, 146, 370, 199, 81, 428, 278, 2, 400, 23, 470, 242, 411, 470, 330, 144, 189, 204, 62,
				318, 475, 24, 457, 83, 204, 322, 250, 478, 186, 467, 350, 171, 119, 245, 399, 112, 252, 201, 324, 317,
				293, 44, 295, 14, 379, 382, 137, 280, 265, 78, 38, 323, 347, 499, 238, 110, 18, 224, 473, 289, 198, 106,
				256, 279, 275, 349, 210, 498, 201, 175, 472, 461, 116, 144, 9, 221, 473 };
//		System.out.println(numPairsDivisibleBy60Enhanced(arr2));
	}

	// OOM occurs with the input
	private static int numPairsDivisibleBy60(int[] time) {
		int result = 0;
		for (int i = 0; i < time.length; i++) {
			for (int j = i + 1; j < time.length; j++) {
				if ((time[i] + time[j]) % 60 == 0) {
					result++;
				}
			}
		}
		return result;
	}

	private static int numPairsDivisibleBy60Enhanced(int[] time) {
		int[] remainder = new int[60];
		for (int i = 0; i < time.length; i++) {
			int rem = time[i] % 60;
			remainder[rem]++;
		}
		System.out.println(Arrays.toString(remainder));

		int result = 0;
		for (int i = 1; i < 30; i++) {
			result = result + (remainder[i] * remainder[60 - i]);
		}

		if (remainder[0] > 0) {
			result = result + (remainder[0] * (remainder[0] - 1) / 2);
		}

		if (remainder[30] > 0) {
			result = result + (remainder[30] * (remainder[30] - 1) / 2);
		}

		return result;// numPairsDivisibleBy60(remainder, time.length);
	}

	private static int numPairsDivisibleBy60(int[] time, int arrLength) {
		int result = 0;
		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if ((time[i] + time[j]) % 60 == 0) {
					result++;
				}
			}
		}
		return result;
	}
	
	public int numPairsDivisibleBy6011(int[] time) {
		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for (int t : time) {
			int mod = t % 60;
			int rem = (mod == 0) ? 0 : 60 - mod;
			ans += map.getOrDefault(rem, 0);
			map.put(mod, 1 + map.getOrDefault(mod, 0));
		}

		return ans;
	}
}
