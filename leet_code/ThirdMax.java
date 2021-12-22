package leet_code;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {
    public static int thirdMax(int[] nums){
        // Sort the array
        // Arrays.sort(nums); - This will take O(N log N), but we want to achieve O(N)

        // Remove duplicates by adding nums to set
        Set<Integer> set = new HashSet<>();
        // int k = 3;
        for (int num: nums){
            set.add(num);
        }
        int maxi = Collections.max(set);
        if (set.size() < 3)
            return maxi;
        else
            set.remove(maxi);
            int sec_max = Collections.max(set);
            set.remove(sec_max);
            maxi = Collections.max(set);
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax(nums));
    }
}
