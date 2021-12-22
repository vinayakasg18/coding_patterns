package leet_code;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaxSecApproach {
    public static int thirdMax(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int num: nums){
            set.add(num);
            if (set.size() > 3){
                set.remove(Collections.min(set));
            }
        }

        if (set.size() < 3)
            return Collections.max(set);
        return Collections.min(set);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax(nums));
    }
}

// Time Complexity is: O(N)
// Space Complexity is: O(1),
    // Because maximums never holds more than 3 items at a time,
    // it is considered to be constant O(1).
