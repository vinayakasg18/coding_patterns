package patterns.sliding_window.max_sum;

public class MaxSumOfContiguousSubArrayBrute {
    public static int maxcontSum(int[] arr, int k){
        int sum = 0;
        int len = arr.length;

        for (int i = 0; i < len - k; i++){
            int cur_sum = 0;
            for (int j = i; j < k + i; j++){
                cur_sum += arr[j];
            }
            sum = Math.max(cur_sum, sum);
        }

        return sum;
    }

    //main
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxcontSum(arr, k));
    }
}
