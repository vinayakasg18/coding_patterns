package oas.samsara;

public class SortedPairs {
    public static int[] sortPairs(int[] nums){
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i += 2){
            int j = i + 1;
            int x = nums[i];

            if (j < nums.length){
                int y = nums[j];

                if (x > y){
                    res[i] = y;
                    res[j] = x; 
                }
                else{
                    res[i] = x;
                    res[j] = y;
                }
            }
            else{
                res[i] = x;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 3, 2, 1, 0};
        sortPairs(nums);
    }
}
