package leet_code;

public class MaxConsOnes {
    public static int maxOnes(int[] nums){
        int longestSequence = 0;
        for (int i = 0; i < nums.length; i++){
            int nZeros = 0;

            for (int j = i; j <nums.length; j++){
                if (nums[j] == 0)
                    nZeros++;
                if (nZeros <= 1){
                    longestSequence = Math.max(longestSequence, j - i + 1);
                }
            }
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 1, 0, 1};
        maxOnes(nums);
    }
}
