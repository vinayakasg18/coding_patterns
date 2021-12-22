package oas.Databricks;

public class OddNumberOfZeros {
    public static int odddNumbersOfzero(int[] a){
        int oddCount = 0;
	
        for (int i = 0; i < a.length; i++) {
            String numString = Integer.toString(a[i]);
            int nZeros = 0;
            for (int j = 0; j < numString.length(); j++) {
                if (numString.charAt(j) == '0')
                    nZeros++;
            }
            
            if (nZeros % 2 == 1)
                oddCount++;
        }
	    return oddCount;
    }

    public static void main(String[] args) {
        int[] a = {10, 2, 3, 100, 20, 30, 0};

        System.out.println(odddNumbersOfzero(a));
    }
}
