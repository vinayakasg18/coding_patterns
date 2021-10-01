package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {
    public static int findLength(char[] arr){
        int length = 0;
        int totalBuckets = 2;
        int start = 0;

        Map<Character, Integer> bucket = new HashMap<>();

        for (int end = 0; end < arr.length; end++){

            char fruit = arr[end];
            bucket.put(fruit, bucket.getOrDefault(fruit, 0) + 1);

            while (bucket.size() > totalBuckets){
                bucket.put(arr[start], bucket.get(arr[start]) - 1);

                if (bucket.get(arr[start]) == 0){
                    bucket.remove(arr[start]);
                }
                start++;
            }

            length = Math.max(length, end - start + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'A', 'C'};

        System.out.println(findLength(arr));
    }
}


// 