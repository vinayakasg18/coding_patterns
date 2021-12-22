package oas.ebay;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class StringPairs {
    public static void main(String[] args) {
        String[] strings = new String[] { "back", "backdoor", "gammon", "backgammon", "comeback", "come", "door" };
        // List<Pair<String, String>> result = new ArrayList<>();

        List<Map.Entry<String, String>> result = new ArrayList<>();

        List<String> input = Arrays.asList(strings);
        Collections.sort(input, (a, b) -> (a.length() - b.length()));
        System.out.println(input);
        Trie root = new Trie();
        for (String s : input) {
            search(root, s, 0, "", result);
        }
        System.out.println(result);
    }

    private static void createTrie(Trie root, String s) {
        Trie current = root;
        for (int i = 0; i < s.length(); i++) {
            if (current.alphabets[s.charAt(i) - 'a'] == null) {
                current.alphabets[s.charAt(i) - 'a'] = new Trie();
            }
            current = current.alphabets[s.charAt(i) - 'a'];
        }
        current.isEnd = true;
    }

    private static void search(Trie root, String string, int id, String sub, List<Map.Entry<String, String>> result) {
        if (id >= string.length() && root.isEnd) {
            Map.Entry<String,String> entry = new AbstractMap.SimpleEntry<String, String>(string, sub);
            result.add(entry);
            return;
        }
        for (int i = id; i < string.length(); i++) {
            if (root.alphabets[string.charAt(i) - 'a'] == null) {
                continue;
            } else {
                search(root.alphabets[string.charAt(i) - 'a'], string, i + 1, sub + string.charAt(i), result);
            }
        }

        // Add to trie
        createTrie(root, string);
    }
}

class Trie {
    Trie[] alphabets;
    boolean isEnd;

    Trie() {
        alphabets = new Trie[26];
        isEnd = false;
    }
}
