package oas.tiktok;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
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

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("tea");
        a.add("tea");
        a.add("act");
        b.add("ate");
        b.add("toe");
        b.add("acts");
        System.out.println(getMinimumDifference(a, b));
    }
}
