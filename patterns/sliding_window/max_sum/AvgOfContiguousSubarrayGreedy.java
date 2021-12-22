package patterns.sliding_window.max_sum;

// ****** Probelm Statement ****** //
// Given an array, find the average of all contiguous subarrays of size ‘K’ in it.

class AvgOfContiguousSubarrayGreedy{
  public double[] calculate(int k, int[] arr){
    int len = arr.length;
    double[] result = new double[len - k + 1];

    //calculate the avg of contiguous sub-arrays
    for (int i = 0; i <= len - k; i++){
      double sum = 0;
      for (int j = i; j < k + i; j++){
        sum += arr[j];
      }
      result[i] = sum / k;
    }
    return result;
  }

  public static void main(String[] args){
    int k = 5;
    int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
    AvgOfContiguousSubarrayGreedy cal = new AvgOfContiguousSubarrayGreedy();
    double[] res = new double[k];
    res = cal.calculate(k, arr);
    for (int i = 0; i < arr.length - k + 1; i++){
      System.out.println(res[i]);
    }
  }
}
