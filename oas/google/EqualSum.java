package oas.google;

class EqualSum {
    public static int Max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static int maxCountSameSUM(int arr[], int n) {
        int maxi = Max(arr);
        int[] M = new int[2 * maxi + 1];

        for (int i = 0; i < M.length; i++)
            M[i] = 0;

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                M[(arr[i] + arr[j])] += 1;

        int max_count = 0;

        for (int i = 0; i < 2 * maxi; i++)
            if (max_count < M[i])
                max_count = M[i];
        return max_count;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 2, 2, 3 };
        int n = arr.length;
        System.out.print(maxCountSameSUM(arr, n));
    }
}
