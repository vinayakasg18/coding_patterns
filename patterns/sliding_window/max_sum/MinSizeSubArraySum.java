package patterns.sliding_window.max_sum;

// Given an array of positive numbers and a positive number ‘S’, 
// find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. 
// Return 0, if no such subarray exists.

public class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr){

        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int end = 0; end < arr.length; end++){
            sum += arr[end];

            while (sum >= S){
                sum -= arr[start];
                minLength = Math.min(end - start + 1, minLength);
                start++;
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int s = 7;

        System.out.println(findMinSubArray(s, arr));
    }
}

// The above for loop runs for N elements and while processes each element only once. Therefore the time complexity is O(N + N)
// i.e, O(N)
