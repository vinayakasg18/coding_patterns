import java.util.*;

public class brokenKeyboard {
    // public static int brokKeyBoard(String text, char[] letters){
    //     int count = 0;

    //     Set<Character> set = new HashSet<>();

    //     for (char c : letters){
    //         set.add(c);
    //     }


    //     return count;
    // }

    private static int brokeKeyboard(String text, char[] letters) {
        if (nolts(text)) {
            return text.length();
        }
        int result = -1;
        String[] brokenSentence = text
                .replaceAll("\\W", " ")
                .toLowerCase()
                .split(" ");
        for (String s : brokenSentence) {
            if (containletters(s, Arrays.toString(letters))) {
                result++;
            }
        }
        return result;
    }

    private static boolean nolts(String words) {
        return words.matches("[0-9\\-/@#$%^&_+=()]+");
    }

    private static boolean containletters(String a, String b) {
        Set<Character> chars = new HashSet<>();
        for(int i = 0; i < a.length(); i++) {
            chars.add(a.charAt(i));
        }

        for (Character character : chars) {
            if (!b.contains(character.toString())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "Hi, this is Chris";
        char[] letters = {'e', 'i', 'h', 'l', 'o', 's'};

        System.out.println(brokeKeyboard(text, letters));
    }
}
