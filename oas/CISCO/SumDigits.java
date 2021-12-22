package oas.CISCO;

import java.util.Scanner;

class SumDigits{

    static int sumDigits(int numX, int numY){
        int ans = 0;
        for(int i=0;i<=numX;i++){
            //Initialize variable to find sum of digits
            int s = 0;
            //Initialize the number
            int x = i;
            while (x>0){
                s += x%10;
                x /= 10;
            }
            if(s == numY){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Read the integers X and Y
        int X = in.nextInt();
        int Y = in.nextInt();
        int result = sumDigits(X, Y);
        System.out.println(result);
        in.close();
    }
}
