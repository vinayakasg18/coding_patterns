package leet_code;

public class BalacnedSalesArray {
    public static int balanceSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (curr == sum - curr - arr[i]) {
                return i;
            }
            curr += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5, 2, 2, 10, 14, 7};
        System.out.println(balanceSum(arr));
    }
}
