package leet_code;

public class MaximumSubArraySumL53 {
    public static int maxSum(int[] nums){
        int sum = nums[0];
        int tsum = nums[0];

        // DP, Kaden's algorithm
        for (int i = 1; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            tsum = Math.max(sum, tsum);
        }
        // Better approach
        // for (int num: nums){
        //     sum = Math.max(num, sum + num);
        //     tsum = Math.max(sum, tsum);
        // }

        // for (int i = 0; i < num.length; i++){
        //     int inSum = 0;
        //     for (int j = i; j < num.length; j++){
        //         inSum += num[j];
        //         sum = Math.max(inSum, sum);
        //     }
        // }
        return tsum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(nums));
    }
}
