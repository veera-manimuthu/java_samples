package java_samples.java.arr;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		int arr[] = { -4, -1, 0, 3, 10 };
		int res[] = sortedSquares(arr);
		System.out.println(printArr(res));
	}

	private static String printArr(int[] res) {
		String va = "";
		for (int r = 0; r < res.length; r++) {
			va = va + res[r] + ",";
		}
		return va;
	}
	
	 public static int[] sortedSquares(int[] nums) {
	        int localArr[] = new int[nums.length];
	        for (int i=0; i< nums.length; i++) {//16
	            localArr[i] = nums[i] * nums[i];
	             for (int k=0; k<=i; k++) {//1
	                if (localArr[i] < localArr[k]) { //16 < 100
	                    int temp = localArr[i];//temp=16
	                    localArr[i]=localArr[k];//localArr[0]=100
	                    localArr[k] = temp;//localArr[1]=16
	                    //1,16,0,9,100
	                    //
	                }
	            }
	        }
	        
	        
	  
	       return localArr;
	        
	    }

	public static int[] sortedSquares1(int[] nums) {
		int localArr[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			localArr[i] = nums[i] * nums[i];
			
			for (int k = 0; k<= i; k++) {
				if (localArr[i] < localArr[k]) {
					int temp = localArr[i];
					localArr[i] = localArr[k];
					localArr[k] = temp;

				}
			}
			System.out.println("-->"+printArr(localArr));
		}

		/*
		 * for (int i = 0; i < localArr.length; i++) { for (int k = 0; k <
		 * localArr.length; k++) { if (localArr[i] < localArr[k]) { int temp =
		 * localArr[i]; localArr[i] = localArr[k]; localArr[k] = temp;
		 * 
		 * } } System.out.println(printArr(localArr)); }
		 */

		return localArr;

	}

}
