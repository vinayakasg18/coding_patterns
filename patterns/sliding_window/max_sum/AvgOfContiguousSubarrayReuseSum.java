package patterns.sliding_window.max_sum;

class AvgOfContiguousSubarrayReuseSum{
  public double[] calculate(int k, int[] arr){

    int len = arr.length;
    double[] result = new double[len - k + 1];

    int windowStart = 0;
    double windowSum = 0;

    //  0  1  2  3   4  5  6  7  8
    // [1, 3, 2, 6, -1, 4, 1, 8, 2]
    // length = 9
    for (int windowEnd = 0; windowEnd < len; windowEnd++){
      // Add the next element or initial five elements
      windowSum += arr[windowEnd];  // 1: 1, 2: 1 + 3, 3: 1 + 3 + 2, 4: 1 + 3 + 2 + 6, 5: 1 + 3 + 2 + 6 - 1
      if (windowEnd >= k - 1){ // 1: 0, 2: 1, 3: 2, 4: 3, 5: 4 (When 4 >= 4, start sliding)
        result[windowStart] = windowSum / k;
        windowSum -= arr[windowStart]; //Minus the element which is going out of the window
        windowStart++;
      }
    }
    return result;
  }

  public static void main(String[] args) {

    int k = 5;
    int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};

    AvgOfContiguousSubarrayReuseSum cal = new AvgOfContiguousSubarrayReuseSum();
    double[] res = new double[k];
    res = cal.calculate(k, arr);

    for (int i = 0; i < arr.length - k + 1; i++){
      System.out.println(res[i]);
    }
  }
}
