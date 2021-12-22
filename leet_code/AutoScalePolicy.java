package leet_code;

public class AutoScalePolicy {

    public static long finalInstance(int instances, int[] averageUtil) {
        int n = averageUtil.length;
        int i = 0;
        while (i < n) {
            if (averageUtil[i] < 25) {
                if (Math.ceil(instances) > 1){
                    instances = instances % 2 == 0 ? instances / 2 : (instances + 1) / 2;
                    i = i + 11;
                }
            }
            else if (averageUtil[i] > 60) {
                if (instances <= 2 * Math.pow(10, 8)){
                    instances = instances * 2;
                    i = i + 11;
                }
            }
            i = i + 1;
        }
        return instances;
    }

    public static void main(String args[]) {
        int instances = 5;
        int[] averageUtil = { 30, 5, 4, 8, 19, 89 };
        System.out.println(finalInstance(instances, averageUtil));
    }
}
