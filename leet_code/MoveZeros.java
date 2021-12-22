package leet_code;

public class MoveZeros {
    public static int[] move(int[] arr){
        int i = 0;
        int j = 0;

        int len = arr.length;

        while (j < len){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        // for (int k = i; k < len; k++){
        //     arr[k] = 0;
        // }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        move(arr);
    }
}
