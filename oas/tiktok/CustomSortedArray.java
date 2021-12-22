package oas.tiktok;

import java.util.ArrayList;
import java.util.List;

public class CustomSortedArray {
    public static int moves(List<Integer> arr){
        int count = 0;
        int evenCount = 0;
        int i = 0;

        for (int n : arr){
            if (n % 2 == 0)
                evenCount++;
        }

        while (i < evenCount){
            if (arr.get(i) % 2 != 0)
                count++;
            i++;
        }

        return count;

        /* 
        int evens = 0;
        int swaps = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i)%2 == 0){
                if(arr.get(evens)%2 == 1)
                    swaps++;
                evens++;
            }
        }
        return swaps;
        */
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(10);
        arr.add(21);
        arr.add(20);
        System.out.println(moves(arr));
    }
}
