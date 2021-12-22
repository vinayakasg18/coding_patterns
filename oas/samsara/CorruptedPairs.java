package oas.samsara;

import java.util.ArrayList;
import java.util.List;

public class CorruptedPairs {
    public static List<Integer> fixCorruptedArray(int[][] pairs){
        List<Integer> visited = new ArrayList<Integer>();

        for (int i = 0; i < pairs.length; i++){
            int x = pairs[i][0];
            int y = pairs[i][1];

            if (!visited.contains(x)){
                visited.add(x);
            }
            if (!visited.contains(y)){
                visited.add(y);
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        int[][] pairs = {{3, 5}, {1, 4}, {2, 4}, {1, 5}};

        fixCorruptedArray(pairs);
    }
}
