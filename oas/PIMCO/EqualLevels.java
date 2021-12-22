package oas.PIMCO;

/* 
* Two signals 
*/

import java.util.*;

class EqualLevels {
    public static int updateTimes(List<Integer> signalOne, List<Integer> signalTwo) {
    System.out.println(signalOne);
    System.out.println(signalTwo);
    int count = 0;
    int Max = 0;
    int maxSize = Math.min(signalOne.size(),signalTwo.size());
    for (int i = 0; i < maxSize; i++){
        int a = signalOne.get(i);
        int b = signalTwo.get(i);
        if (a == b){
            if (a > Max){
                count++;
                Max = a;
            }
        }
    }
    return count;
    }
}