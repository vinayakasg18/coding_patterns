package oas.visa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Tripplets {
    // Function to print all distinct triplets in the array with a sum
    // less than or equal to a given number
    public static void generateAllTriplets(List<Integer> input, int sum, int begin, List<Integer> comb,
            List<List<Integer>> result) {
        if (comb.size() == 3) {
            result.add(new ArrayList<>(comb));
            return;
        }

        for (int i = begin; i < input.size() && input.get(i) <= sum; i++) {
            comb.add(input.get(i));
            generateAllTriplets(input, sum - input.get(i), i + 1, comb, result);
            comb.remove(comb.size() - 1); // backtrack
        }
    }

    // Wrapper over `generateAllTriplets()` function
    public static int printAllTriplets(List<Integer> input, int sum) {
        // sort the input
        Collections.sort(input);
        List<Integer> comb = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        generateAllTriplets(input, sum, 0, comb, result);

        int length = result.size();
        return length;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 6); // 1 2 3 4 5 7 9
        int sum = 8;
        System.out.println(printAllTriplets(input, sum));
    }
}
