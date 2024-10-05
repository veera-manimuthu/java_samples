package java_samples.java;

public class NumberToBits {

	public static void main(String[] args) {
		Long number = 9791134078L;
		String binaryString = Long.toBinaryString(number);
		System.out.println(binaryString);
		
		int num = 100;
		binaryString = Integer.toBinaryString(num);
		System.out.println(binaryString);
		
		
		int remainder = 0;
		int index = 0;
		int []bits = new int[32];
		while (num !=0) {
			remainder = num % 2;
			num /= 2;
			bits[index] = remainder;
			index++;
		}
		
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(bits[i] + " ");
		}
		
	}

}
