package oas.liveRamp;

import java.util.*;

class DeleteString {

    // function which return the minimum value

    public static int minValue(Set<Integer> al, int[] C) {
        int value = 0;
        if (al.size() > 0) {
            List<Integer> weightedArray = new ArrayList<>();

            // add all the elements' value into the list
            for (int j : al)
                weightedArray.add(C[j]);

            // find max value in weightedArray list
            int max = Collections.max(weightedArray);

            // adding the elements value except the max value

            for (int k : weightedArray) {
                if (k != max)
                    value += k;
            }
        }
        return value;
    }

    public static int solution(String S, int[] C) {
        Set<Integer> al = new LinkedHashSet<>();
        int res = 0;

        for (int i = 0; i < S.length() - 1; i++) {
            // if adajcent characters are equal,
            // store the index value into set

            if (S.charAt(i) == S.charAt(i + 1)) {
                al.add(i);
                al.add(i + 1);
            }

            else { // if not get the min value and clear the set
                res += minValue(al, C);
                al.clear();
            }
        }
        // if set contains any elements,
        // get the minimum value add it with res

        res += minValue(al, C);
        return res;
    }

    public static void main(String[] args) {
        // Testcase 1
        int arr1[] = { 0, 1, 2, 3, 4, 5 };
        System.out.println(solution("abccd", arr1));
        
        // Testcase 2
        int arr2[] = { 1, 2, 1, 2, 1, 2 };
        System.out.println(solution("aabbcc", arr2));
        
        // Testcase 3
        int arr3[] = { 3, 4, 5, 6 };
        System.out.println(solution("aaaa", arr3));

        // Testcase 4
        int arr4[] = { 10, 5, 10, 5, 10 };
        System.out.println(solution("ababa", arr4));

    }
}