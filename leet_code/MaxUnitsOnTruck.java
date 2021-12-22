package leet_code;

import java.util.Arrays;
import java.util.Comparator;

public class MaxUnitsOnTruck {
    
    // First sort based on the box size
    public static void sort2DArray(int[][] arr, int col){
        Arrays.sort(arr, new Comparator<int[]>(){
            
            @Override
            public int compare(int[] val1, int[] val2){
                // Sort descending order by column 2
                // When OBJ1 has to come before OBJ2
                if (val1[col - 1] > val2[col - 1]){
                    return -1;
                }
                else{
                    // When OBJ1 has to come after OBJ2
                    return 1;
                }
            }
        });
    }

    public static int MaxUnits(int[][] boxTypes, int truckSize){
        int maxBoxes = 0;

        // Sort the 2D array in non-increasing order
        sort2DArray(boxTypes, 2);

        int i = 0;

        while (truckSize > 0){
            if (truckSize >= boxTypes[i][0]){
                maxBoxes += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                maxBoxes += truckSize * boxTypes[i][1];
                truckSize -= truckSize;
            }
            i++;

            if (i > boxTypes.length - 1)
                truckSize = 0;
        }
        return maxBoxes;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        System.out.println(MaxUnits(boxTypes, truckSize));
    }
}

/* 
Time Complexity : O(nlogn), where n is the number of elements in array boxTypes.

Sorting the array boxTypes of size n takes (n \log n)(nlogn) time. 
Post that, we iterate over each element in array boxTypes and in worst case, 
we might end up iterating over all the elements in the array. This gives us time complexity as O(nlogn)+O(n)=O(nlogn).

Space Complexity: O(1), as we use constant extra space.

*/