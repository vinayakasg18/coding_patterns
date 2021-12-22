package leet_code.top50_easy_int_questions;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        int i = 0;
        int j = 1;

        while (j < nums.length){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }

            j++;
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5};
        removeDuplicates(nums);
    }
}
