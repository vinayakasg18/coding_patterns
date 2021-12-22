package leet_code;

public class SquareEvenIndexElements {
    public static int[] squareEven(int[] arr){

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0)
                arr[i] *= arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, -2, -9, 11, 56, -12, -3, 7};
        arr = squareEven(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
