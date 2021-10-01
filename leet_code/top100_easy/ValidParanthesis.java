package leet_code.top100_easy;

import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String S){
        // Create a map
        Map<Character, Character> map = Map.of('(', ')',
                                                    '{', '}',
                                                    '[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c: S.toCharArray()){
            if (map.containsKey(c))
                stack.push(c);
            else{
                if (stack.isEmpty())
                    return false;
                char open = stack.pop();
                if (map.get(open) != c)
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String S = "()[]{}";
        System.out.println(isValid(S));
    }
}
