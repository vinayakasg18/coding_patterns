package leet_code.top100_easy;

import java.util.HashMap;
import java.util.Map;

// ** 
//Given an array of integers nums and an integer target, 
//return indices of the two numbers such that they add up to target.
// **
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numi = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            int tkey = target - nums[i];
            
            if (numi.containsKey(tkey)){
                return new int[] {i, numi.get(tkey)};
            }
            else{
                numi.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }
}
