package leet_code;

public class SubstringInString {
    public static int substring(String s1, String s2){

        int M = s1.length();
        int N = s2.length();
        for (int i = 0; i <= N - M; i++){
            for (int j = 0; j < M; j++){
                Character ch1 = s1.charAt(j);
                Character ch2 = s2.charAt(i + j);
                if (!ch1.equals(ch2)){
                    break;
                }
                if (j == M - 1)
                    return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "for";
        String s2 = "geeksforgeeks";

        System.out.println(substring(s1, s2));
    }
}
