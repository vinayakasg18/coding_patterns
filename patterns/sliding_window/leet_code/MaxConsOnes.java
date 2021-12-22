package patterns.sliding_window.leet_code;

public class MaxConsOnes {
    public static int maxOnes(int[] nums){
        int longestSequence = 0;
        int nZeros = 0;
        int i = 0;
        int j = 0;

        while (j < nums.length){
            if (nums[j] == 0){
                nZeros++;
            }

            while (nZeros > 1){
                if (nums[i] == 0){
                    nZeros--;
                }
                i++;
            }

            longestSequence = Math.max(longestSequence, j - i + 1);
            j++;
        }
        return longestSequence;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 1, 0, 1};
        maxOnes(nums);
    }
}
