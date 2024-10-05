package java_samples.java;

public class StringToAscii {

	public static void main(String[] args) {
		System.out.println("AZ09Veera12345, aReev-" + checkWhetherPalindrome("AZ09Veera12345, aReev".toLowerCase()));
		System.out.println("M  a D am-" + checkWhetherPalindrome("M  a D am".toLowerCase()));//
		System.out.println("A man, a plan, a canal: Panama-"
				+ checkWhetherPalindrome("A man, a plan, a canal: Panama".toLowerCase()));
		System.out.println("a. -" + checkWhetherPalindrome("a. "));
		System.out.println("0P-" + checkWhetherPalindrome("0P"));
		System.out.println("A-" + checkWhetherPalindrome("A"));
		System.out.println(",,,,,,,,,,,,acva-" + checkWhetherPalindrome(",,,,,,,,,,,,acva"));
		System.out.println(".,-" + checkWhetherPalindrome(".,"));

		int c = 'a' - 'A';
		System.out.println(c);
		// lowerCase alphabets starts from 97 to 122
		// upperCase alphabets starts from 65 to 90
		// numbers (0 to 9) starts from 48 to 57
	}

	private static boolean checkWhetherPalindrome(String string) {
		string = string.toLowerCase();
		var end = string.length() - 1;
		int idx = 0;
		while (idx < end) {
			var asciiFirstChar = (int) string.charAt(idx);
			var asciiLastChar = (int) string.charAt(end);

			if (!isCharAlphabet(asciiFirstChar)) {
				idx++;
				continue;
			}
			if (!isCharAlphabet(asciiLastChar)) {
				end--;
				continue;
			}

			if (asciiFirstChar != asciiLastChar) {
				return false;
			}
			idx++;
			end--;
		}

		return true;
	}

	private static boolean isCharAlphabet(int character) {
		return (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')
				|| (character >= '0' && character <= '9');
	}

}
