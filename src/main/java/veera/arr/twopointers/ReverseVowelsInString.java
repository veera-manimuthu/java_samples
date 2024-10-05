package veera.arr.twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReverseVowelsInString {

	public static void main(String[] args) {
		System.out.println("IceCreAm-->"+reverseVowels("IceCreAm"));
		System.out.println("leetcode-->"+reverseVowels("leetcode"));
	}

	public static String reverseVowels(String s) {
		Set<Character> set = Set.of('a', 'e');
		Set<String> res = Set.of();
//		List.of(null)
		
		List<String> vowels = new ArrayList<>();
		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			String ch = String.valueOf(s.charAt(i));
			if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i")
					|| ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")) {
				vowels.add(idx++, ch);
			}
		}

		if (vowels.size() == 0) {
			return s;
		}
		StringBuilder result = new StringBuilder();
		for (int start = 0, end = vowels.size()-1; start < s.length(); start++) {
			String ch = String.valueOf(s.charAt(start));
			if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i")
					|| ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")) {
				result.append(vowels.get(end));
				end--;
			} else {
				result.append(ch);
			}
		}

		return result.toString();

	}
}
