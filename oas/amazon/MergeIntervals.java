package oas.amazon;

import java.util.Collections;
import java.util.List;

public class MergeIntervals {
    public static List<List<Integer>> mergeInterval(List<List<Integer>> input){
        // Sort based on the first index
        Collections.sort(input, (a, b) -> Integer.compare(a.get(0), b.get(0)));

        
        return null;
    }
}
