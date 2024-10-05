package veera.dsa.sorting;

public class QuickSortUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Input");
		int arr[] = { 1, -1, 7, 9, 0, 5, 4, 3, -9};// o/p - [-1 0 1 3 4 5 7 9]
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Output");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int p = partition(arr, 0, end);

			quickSort(arr, 0, p - 1);
			quickSort(arr, p + 1, end - 1);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		int temp = arr[j + 1];
		arr[j + 1] = arr[end];
		arr[end] = temp;

		return j + 1;
	}
}
