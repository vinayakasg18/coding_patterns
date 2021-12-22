package leet_code;

public class SortArrayByParity {
    public static int[] sortParityArray(int[] arr){
        int i = 0;
        int j = 0;

        while (j < arr.length){
            int mod = arr[j] % 2;
            if (mod == 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        sortParityArray(arr);
    }
}
