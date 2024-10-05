package java_samples.java.arr;

//Find Numbers with Even Number of Digits
public class FindNumWithEvenDigits {

	public static void main(String[] args) {
		int numberArr[] = {123, 456, 2, 456, 6789, 100,555,901,482,1771};
		System.out.println(findNumbers(numberArr));
	}
	
	private static int findNumbers(int[] nums) {
		int occur = 0;
		for (int i = 0; i< nums.length; i++) {
			String val = String.valueOf(nums[i]);
			if (val.length() % 2 == 0) {
				occur++;
			}
		}
		
		return occur;
	}

}
