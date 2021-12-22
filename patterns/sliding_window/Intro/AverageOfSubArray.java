package patterns.sliding_window.Intro;

// Brute force method
public class AverageOfSubArray {
    public static double[] avgSubArray(int[] arr, int K){

        double[] res = new double[arr.length - K + 1]; 

        for (int i = 0; i <= arr.length - K; i++){
            double sum = 0;
            double avg = 0;
            for (int j = i; j < i + K; j++){
                sum += arr[j];
            }
            avg = sum / K;
            res[i] = avg;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int K = 5;
        System.out.println(avgSubArray(arr, K));
    }
}
