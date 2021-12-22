package oas.liveRamp;

class GameFinish {
    public static int game(int[] D, int X) {
        int count = 1;
        int curMin = D[0];
        int curMax = D[0];

        for (int i = 1; i < D.length; ++i) {
            if (Math.abs(D[i] - curMin) > X || Math.abs(D[i] - curMax) > X){
                count++;
                curMin = D[i];
                curMax = D[i];
            }
            else{
                if (curMax < D[i])
                    curMax = D[i];
                if (curMin > D[i])
                    curMin = D[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] D = { 2, 5, 9, 2, 1, 4 };
        int X = 4;
        System.out.println(game(D, X));
    }
}