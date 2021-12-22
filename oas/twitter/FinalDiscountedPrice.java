package oas.twitter;

import java.util.Stack;

public class FinalDiscountedPrice {
    public static void finalDiscountedPrice(int[] prices){
        int finalSum = 0;
        String fp = "";
        int j = 0;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        while (i < prices.length){
            int p = prices[i];
            while(stack.size() > 0 && prices[stack.peek()] >= p){
                int dp = stack.pop();
                finalSum += prices[dp] - p;
            }
            stack.push(i);
            i++;
        }
        while (j < stack.size()){
            int pi = stack.get(j);
            fp += String.valueOf(pi);
            finalSum += prices[pi];
            j++;
        }
        stack.clear();
        System.out.println(finalSum);
        System.out.println(fp);
        
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 3, 2, 5};
        finalDiscountedPrice(prices);
    }
}
