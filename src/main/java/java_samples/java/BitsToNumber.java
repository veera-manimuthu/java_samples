package java_samples.java;

public class BitsToNumber {

	public static void main(String[] args) {
		int numberAsBits = 1010;//(1* 2 pow 3)+ (0* 2 pow 2) + (1* 2 pow 1) + (0* 2 pow 0) = (8+0+2+0)=10
		
		integerBitsToDecimal(numberAsBits);
		
		strBitsToDecimal("1001000111100110001101100101111110");
	}

	private static void integerBitsToDecimal(int numberAsBits) {
		int temp = numberAsBits;
		int i=0;
		int rem = 0;
		int ans = 0;
		System.out.println("numberAsBits--"+numberAsBits);//19
		while (numberAsBits != 0) {
			System.out.println("i-"+i);
			rem = numberAsBits % 10;//remainder
			System.out.println("rem-"+rem);
			numberAsBits /= 10; //quotient
			System.out.println("numberAsBits-"+numberAsBits);
			ans += rem * Math.pow(2, i);
			System.out.println("ans-"+ans);
			//(1* 2 pow 3)+ (0* 2 pow 2) + (1* 2 pow 1) + (0* 2 pow 0) = (8+0+2+0)=10
			i++;
		}
		
		System.out.println(temp + "--->" + ans);
	}
	
	private static void strBitsToDecimal(String s) {
		Long ans = 0L; 
		int i=0, p = 0;

		// length of String
		int len = s.length();

		// Traversing the String
		for (i = len - 1; i >= 0; i--) {

			if (s.charAt(i) == '1') {
				// Calculating Decimal Number
				ans = (long) (ans + Math.pow(2, p));
			}
			// incrementing value of p
			p++;
		}
		System.out.println("Decimal Equivalent of " + s + " is " + ans);
	}

}
