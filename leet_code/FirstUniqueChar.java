package leet_code;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer[]> map = new HashMap<>();
        int index = 0;
        
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            Integer[] defaultValue = map.get(ch);
            map.put(ch, new Integer[] {i, defaultValue[1] + 1});
        }
        return index;
    }
    
    public static void main(String[] args) {
        String s = "leetcode";
        firstUniqChar(s);
    }
}
