package oas.tiktok_oas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramDifference {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>(Arrays.asList("a", "jk", "abb", "mn", "abc"));
		List<String> b = new ArrayList<>(Arrays.asList("bb", "kj", "bbc", "op", "def"));
		List<Integer> result = getMinimumDifference(a, b);
		System.out.println(result);
	}

	public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
		String s1 = "", s2 = "";
		List<Integer> result = new ArrayList<Integer>();
		int length = a.size(), i = 0;
		while (i < length) {
			s1 = a.get(i);
			s2 = b.get(i);
			result.add(countManipulations(s1, s2));
			i++;
		}
		return result;
	}

	static int countManipulations(String s1, String s2) {
		if (s1.length() != s2.length())
			return -1;
		int count = 0;

		// store the count of character
		int[] char_count = new int[26];

		// iterate though the first String
		// and update count
		for (int i = 0; i < s1.length(); i++)
			char_count[s1.charAt(i) - 'a']++;

		// iterate through the second string
		// update char_count.
		// if character is not found in
		// char_count then increase count
		for (int i = 0; i < s2.length(); i++)
			char_count[s2.charAt(i) - 'a']--;

		for (int i = 0; i < 26; ++i) {
			if (char_count[i] != 0) {
				count += Math.abs(char_count[i]);
			}
		}
		return count / 2;
	}

}
