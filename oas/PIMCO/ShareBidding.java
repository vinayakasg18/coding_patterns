package oas.PIMCO;

import java.util.*;

public class ShareBidding {

    // List<List<Integer>> bids, int totalShares
    public static void sortArray(int[][] arr, int col){
        Arrays.sort(arr, new Comparator<int[]>(){

            @Override
            public int compare(int[] val1, int[] val2){
                if (val1[col - 1] > val2[col - 1]){
                    return -1;
                }
                else if (val1[col] == val2[col]){
                    return 1;
                }
                else{
                    return 1;
                }
            }
        });
    }
    
    public static List<Integer> getUnallottedUsers(int[][] bids, int totalShares){
        List<Integer> unAllottedUsers = new ArrayList<>();
        sortArray(bids, 3);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i  = 0; i < bids.length; i++){
            map.put(bids[i][0], bids[i][1]);
            System.out.println(map.get(bids[i][0]));
        }
        return unAllottedUsers;
    }

    public static void main(String[] args) {
        int[][] bids = {{1, 5, 5, 0}, {2, 7, 8, 1}, {3, 7, 5, 1}, {4, 10, 3, 3}};
        getUnallottedUsers(bids, 18);
    }
}
