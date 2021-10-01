package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HighlyProfotableMonths {

    public static int countHighlyProfitableMonths(List<Integer> stockPrices, int k) {    
    stockPrices = new ArrayList<>(Arrays.asList(6426, 9445, 8772, 81, 3447, 629, 3497, 7202, 7775, 4325, 3982, 4784, 8417, 2156, 1932, 5902, 5728, 8537, 3857, 739, 6918, 9211, 9679, 8506, 3340, 6568, 1868, 16, 7940, 6263, 4593, 1449, 6991, 310, 3355, 7068, 1431, 8580, 1757, 9218, 4934, 4328, 3676, 9355, 6221, 9080));
    k = 3;
    int streak = 1;
    int index = 1;
    int count = 0;
    System.out.print(k);
    System.out.println(stockPrices);
    while(index < stockPrices.size()){
        if(stockPrices.get(index) > stockPrices.get(index - 1)){
            streak++;
        } else if(streak >= k){
            count = count + streak - k + 1;
            streak = 1;
        }
        index++;
    }
    if(streak >= k)
        count = count + streak - k + 1;
    return count;
    }

    public static void main(String[] args) {
        countHighlyProfitableMonths(null, 3);
    }
}
