package leet_code;

import java.util.*;
import java.util.Comparator;

public class ReorderLogs {

    public static String[] reorderedLogs(String[] logs){
        Comparator<String> comp = new Comparator<String>(){
            
            @Override
            public int compare(String log1, String log2){
                // Split logs into two parts, log1 and log2

                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);

                // Check for digits
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                // Both logs are letter-logs
                if (!isDigit1 && !isDigit2){
                    // Compare the content
                    int cmp = split1[1].compareTo(split2[1]);

                    if (cmp != 0)
                        return cmp;

                    // Compare logs of same content with identifiers
                    return split1[0].compareTo(split2[0]);
                }

                // One of the log is digit log
                if (!isDigit1 && isDigit2){
                    // letter logs comes before the digit-logs
                    return -1;
                }
                else if (isDigit1 && !isDigit2){
                    return 1;
                }
                else
                    // both are digit logs
                    return 0;
            }
        };
        Arrays.sort(logs, comp);
        return logs;
    }

    public static void main(String[] args) {
        String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};

        System.out.println(reorderedLogs(logs));

    }
}