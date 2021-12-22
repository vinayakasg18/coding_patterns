package oas.tiktok;

public class RockWallClimber {
    public static int jumps(int bigJump, int height){
        int count = 0;

        while (height > 0){
            if (height >= bigJump){
                height -= bigJump;
                count++;
            }
            else{
                height -= 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int height = 10000;
        int bigJump = 1;

        System.out.println(jumps(bigJump, height));
    }
}
