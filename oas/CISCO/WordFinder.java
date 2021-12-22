package oas.CISCO;

import java.util.ArrayList;
import java.util.List;

public class WordFinder {

    public static void main(String[] args) {

        char[][] grid = { { 'C', 'A', 'T' }, { 'I', 'D', 'O' }, { 'M', 'O', 'M' } };
        String[] words = "TAC TOM ADO MOM CLM KLM".split(" ");
        String[] result = getWords(grid, words);
        for (String res : result) {
            System.out.println(res);
        }
    }

    public static String[] getWords(char[][] letters, String[] words) {

        int m = letters.length;
        int n = letters[0].length;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j < n; j++) {
                buffer.append(letters[i][j]);
            }
            list.add(buffer.toString());
        }

        for (int i = 0; i < n; i++) {
            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j < m; j++) {
                buffer.append(letters[j][i]);
            }
            list.add(buffer.toString());
        }

        String[] result = new String[words.length];
        int k = 0;
        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < list.size(); j++) {
                StringBuffer buffer = new StringBuffer(list.get(j));
                if (buffer.toString().contains(words[i]) || buffer.reverse().toString().contains(words[i])) {
                    result[k++] = "Yes";
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[k++] = "No";
            }
        }
        return result;
    }
}