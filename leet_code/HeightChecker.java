package leet_code;

import java.util.Arrays;

public class HeightChecker {
    public static int heightCheck(int[] heights){
        int count = 0;
        int[] resArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(resArray);

        for (int i = 0; i < heights.length; i++){
            if (heights[i] != resArray[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        heightCheck(heights);
    }
}
