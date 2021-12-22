package oas.ebay;

class GFG {
    static class Node {
        Node[] arr = new Node[26];
        int freq;
    };

    static Node insert(String s, Node root) {
        int in;
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            in = s.charAt(i) - 'a';
            if (cur.arr[in] == null)
                cur.arr[in] = new Node();
            cur.arr[in].freq++;
            cur = cur.arr[in];
        }
        return root;
    }

    static int find(String s, int k, Node root) {
        int in, count = 0;
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            in = s.charAt(i) - 'a';
            if (cur.arr[in] == null)
                return 0;
            cur = cur.arr[in];
            count++;
            if (count == k)
                return cur.freq;
        }
        return 0;
    }
    public static long stringPrefixPairs(String[] strings){
        int n = strings.length;
        int freq = 0;
        Node root = new Node();
        for (int i = 0; i < n; i++)
            root = insert(strings[i], root);
            freq = find("back", 3, root);
        return freq;
    }
    public static void main(String[] args) {
        String arr[] = { "back", "backdoor", "gammon", "backgammon", "comeback", "come", "door" };
        // int n = arr.length;

        // Node root = new Node();
        // for (int i = 0; i < n; i++)
        //     root = insert(arr[i], root);
        // System.out.print(find("back", 3, root) + "\n");
        System.out.println(stringPrefixPairs(arr));

    }
}
