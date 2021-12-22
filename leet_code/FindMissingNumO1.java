package leet_code;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumO1 {
    public static List<Integer> findMissing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int elem = Math.abs(nums[i]);
            if (nums[elem - 1] > 0) {
                nums[elem - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4,3,2,7,8,2,3,1 };

        findMissing(nums);
    }
}
