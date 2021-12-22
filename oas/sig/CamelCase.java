package oas.sig;

import java.util.Arrays;

public class CamelCase {
    public static boolean isCamelCase(String[] words, String variableName){
        String word = "";
        int flag = 0;
        for (int i = 0; i < variableName.length(); i++){
            char w = variableName.charAt(i);
            if (flag == 0){
                // word += Character.toLowerCase(w);
                // if (Character.isUpperCase(w) && words.length == 1){
                //     return true;
                // }
                word += Character.toLowerCase(w);
                flag = 1;
            }
            else if(Character.isUpperCase(w)){
                if (!Arrays.stream(words).anyMatch(word::equals)){
                    return false;
                }
                else{
                    word = "";
                    word +=  Character.toLowerCase(w);
                }
            }
            else{
                word += variableName.charAt(i);
            }
        }

        if (!word.equals("")){
            if (!Arrays.stream(words).anyMatch(word::equals)){
                return false;
            }
            word = "";
        }
        return true;
    }

    public static void main(String[] args) {
        String var = "shahswet";
        String[] words = {"shahswetshahswetswetsha"};
        System.out.println(isCamelCase(words, var));
    }
}
