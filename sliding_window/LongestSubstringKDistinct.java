package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    public static int findLength(String S, int k){
        int start = 0;
        int length = Integer.MIN_VALUE;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int end = 0; end < S.length(); end++){
            char rightChar = S.charAt(end);

            // Put the char into map
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            //reduce the occurance of the chars until size of the map becomes < k
            while (charFrequencyMap.size() > k){
                char leftChar = S.charAt(start);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == 0)
                    charFrequencyMap.remove(leftChar);
                start++;
            }
            //calculate the maximum length of the string with distinct chars
            length = Math.max(length, end - start + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        String str = "cbbebi";
        int k = 3;
        System.out.println(findLength(str, k));
    }
}


// First insert the chars into map.
// Check if the size of the map is > k, then shrink or slide the window by incrementing the start.
// in the porcess we reduce the occurance of the char if exists in the map and remove char if the occurance is 0.
// In all this process keep the value of the max length.

// The above for loop runs for N elements and while processes each element only once. Therefore the time complexity is O(N + N)
// i.e, O(N)