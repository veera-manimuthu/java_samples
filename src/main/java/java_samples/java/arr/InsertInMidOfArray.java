package java_samples.java.arr;

public class InsertInMidOfArray {

	public static void main(String[] args) {
		int insertPosition = 1;
		int elementToBeInserted = 9;
		int arr[] = new int[5];
		int len = 0;
		System.out.print("InputArray-");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + len;
			System.out.print(arr[i] + " ");
			len++;
		} // 1 2 3 4 5
		System.out.println();
		
		// Let's say we want to insert 9 in 2nd position. How to do that?
		int newArr[] = new int[arr.length + 1];

		for (int i = 0; i < newArr.length; i++) {
			if (i < insertPosition) {
				newArr[i] = arr[i];
			} else if (i == insertPosition) {
				newArr[i] = elementToBeInserted;
			} else {
				newArr[i] = arr[i - 1];
			}
		}

		System.out.print("OutputArray-");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}

	}

}
