package oas.liveRamp;

import java.util.HashMap;
import java.util.Map;

public class IntegerPairs {
    public static boolean isPair(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            map.put(i, 0);
        }

        for (int num: arr){
            map.put(num, map.getOrDefault(num, 0) + num);
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()){
            if (set.getValue() % 2 != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1};
        System.out.println(isPair(arr));
    }
}
