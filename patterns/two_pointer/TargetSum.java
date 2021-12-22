package patterns.two_pointer;

public class TargetSum {
    public static int[] sum(int[] arr, int targetSum){
        int i = 0;
        int j = arr.length - 1;
        int wSum = 0;
        
        while(i < j){
            wSum = arr[i] + arr[j];
            if (wSum == targetSum){
                return new int[] {i, j};
            }
            if (wSum > targetSum)
                j--;
            else
                i++;
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4, 6};
        int targetSum = 6;
        System.out.println(sum(arr, targetSum));
    }
}
