package leet_code;

public class ReplaceRightElems {
    public static int[] replace(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > max && i != j)
                    max = arr[j];
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {17, 18, 5, 4, 6, 1};

        System.out.println(replace(arr));
    }
}
