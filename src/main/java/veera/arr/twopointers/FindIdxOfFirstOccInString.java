package veera.arr.twopointers;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=problem-list-v2&envId=two-pointers
/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *  
 */
public class FindIdxOfFirstOccInString {

	public static void main(String[] args) {
		System.out.println(strStr("sadbutsad", "sad"));
		System.out.println(strStr("leetcode", "leeto"));
	}

	public static int strStr(String haystack, String needle) {

		return haystack.indexOf(needle);
	}


}
