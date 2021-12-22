package oas.tiktok;

public class AddTwoNumbers {
    public static int addNumbers(float a, float b){
        int sum = 0;
        sum = (int)Math.floor(a + b);
        return sum;
    }

    public static void main(String[] args) {
        float a = (float) 2.34;
        float b = (float) 5.7;
        System.out.println(addNumbers(a, b));
    }
}
