package oas.sisu;

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class Find {
    public static int find(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--){
            if (i + 1 == arr[i])
                map.put(i, arr[i]);
            else
                map.put(i, 0);
        }

        for (int key: map.keySet()){
            if (map.get(key) == 0){
                return key + 1;
            }
            else{
                max = Math.max(key, max);
                res = max;
            }
        }
        return res + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(find(arr));
    }
}
