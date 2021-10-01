package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubString {
    public static int findLength(String strs){

        int totalMax = 0;
        int start = 0;

        // while (start < strs.length() - 1){
        //     if (strs.charAt(start) != strs.charAt(end)){
        //         windowMax += 1;
        //         totalMax = Math.max(windowMax, totalMax);
        //     }
        //     else{
        //         windowMax = 1;
        //     }
        //     start++;
        //     end++;
        // }
        // return Math.max(totalMax, end - start + 1);

        Map<Character, Integer> CharIndexMap = new HashMap<>();
        
        for (int end = 0; end < strs.length(); end++){
            char rightChar = strs.charAt(end);

            if (CharIndexMap.containsKey(rightChar)){
                start = Math.max(start, CharIndexMap.get(rightChar) + 1);
            }
            CharIndexMap.put(rightChar, end);
            totalMax = Math.max(totalMax, end - start + 1);
        }
        return totalMax;
    }

    public static void main(String[] args) {
        String strs = "abbbb";

        System.out.println(findLength(strs));
    }
}
