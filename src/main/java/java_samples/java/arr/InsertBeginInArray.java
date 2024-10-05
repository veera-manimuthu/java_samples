package java_samples.java.arr;

public class InsertBeginInArray {

	public static void main(String[] args) {
		int arr[] = new int[6];
		int len = 0;

		for (int i = 0; i < 3; i++) {
			arr[i] = 9;
			len++;
		}

		System.out.print("Original Array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Let's start insert value 0 in 0th index
		// To do that, first we need to shift the existing elements first
		for (int i = len; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		//inserting in 0th position
		arr[0] = 1;

		System.out.print("Result Array   ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
