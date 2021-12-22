package patterns.sliding_window.Intro;

public class AvgSumOfSubArrayOfn {
    public static double[] avgSubArray(int[] nums, int K){
        double[] avg = new double[nums.length - K + 1];
        double sum = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];

            if (i >= K - 1){
                avg[start] = sum / K;
                sum -= nums[start];
                start++;
            }
        }
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int K = 5;
        System.out.println(avgSubArray(arr, K));
    }
}
