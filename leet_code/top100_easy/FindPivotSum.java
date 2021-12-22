package leet_code.top100_easy;

public class FindPivotSum {
    public static int pivotSum(int[] nums){
        int left_sum = 0;
        int sum = 0;
        for (int num: nums){
            sum += num;
        }

        for (int i = 0; i < nums.length; i++){
            if (left_sum == sum - left_sum - nums[i])
                return i;
            left_sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(pivotSum(nums));
    }
}
