package leet_code;

public class SqaureOfSortedArray {
    public static int[] squareSorted(int[] nums){
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        for (int i = len; i >= 0; i--){
            if (Math.abs(nums[left]) < Math.abs(nums[right])){
                int square = nums[right];
                square *= square;
                nums[right] = square;
                right--;
            }
            else{
                int square = nums[left];
                square *= square;
                nums[left] = square;
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = squareSorted(nums);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
