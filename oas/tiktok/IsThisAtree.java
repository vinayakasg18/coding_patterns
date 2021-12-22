package oas.tiktok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IsThisAtree {

    public static String express(String nodes){

        String alpha = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";

        String[] relations = nodes.split(" ");
        String[] alphas = alpha.split(" ");
        Set<Character> set = new HashSet<>();
        Map<Character, List<Character>> map = new TreeMap<>();
        for (String s: alphas){
            map.put(s.charAt(0), new ArrayList<Character>() {});
        }
        for (String s : relations){
            Character parent = s.toCharArray()[1];
            Character child = s.toCharArray()[3];
            set.add(parent);
            set.add(child);

            if (map.containsKey(parent)){
                map.get(parent).add(child);
            }
            else{
                map.put(parent, new ArrayList<>(Arrays.asList(child)));
            }
        }
        System.out.println(map);
        String result = tree(map);
        return result;
    }

    public static String tree(Map<Character, List<Character>> map){
        List<Character> stack = new ArrayList<>();
        String answer = "(";
        stack.add('(');
        stack.add('A');
        int count = 1;
        while (!stack.isEmpty()){
            Character first = stack.remove(0);
            if (first.equals('(')){
                answer = answer + ')';
                break;
            }
            answer = answer + "(" + first;

            if (map.get(first).size() == 2){
                stack.add(map.get(first).get(1));
                stack.add(map.get(first).get(0));
            }
            else if(map.get(first).size() == 1){
                stack.add(map.get(first).get(0));
                count++;
            }
            else if(map.get(first).size() == 0){
                while (count != 0){
                    answer = answer + ')';
                    count--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String nodes = "(B,D) (D,E) (A,B) (C,F) (E,G) (A,C)";
        System.out.println(express(nodes));
    }
}
