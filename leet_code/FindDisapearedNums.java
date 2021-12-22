package leet_code;

import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

public class FindDisapearedNums {
    public static List<Integer> findMissingNums(int[] nums){
        int len = nums.length;
        List<Integer> res = new ArrayList<>();

        // Map<Integer, Boolean> map = new HashMap<>();

        // for (int i = 0; i < len; i++){
        //     map.put(nums[i], true);
        // }

        // Different appraoch
        // create a new array of i/p array length
        int[] oparray = new int[len];
        for (int i = 0; i < len; i++){
            int elem = nums[i];
            oparray[elem - 1] = nums[i]; 
        }

        // for (int i = 1; i <= len; i++){
        //     if (!map.containsKey(i)){
        //         res.add(i);
        //     }
        // }
        
        for (int j = 0; j < len; j++){
            if (oparray[j] == 0)
                res.add(j + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findMissingNums(nums));
    }
}
