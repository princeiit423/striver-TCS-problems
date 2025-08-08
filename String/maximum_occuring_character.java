package String;

import java.util.HashMap;
//import java.util.HashSet;

public class maximum_occuring_character {
    public static void maxOccur(String s) {
        int ans = 0;
        char ansChar = '\0';
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char key : map.keySet()) {
            int freq = map.get(key);
            if (freq > ans) {
                ans = freq;
                ansChar = key;
            }
        }
        System.out.println(ansChar + " : " + ans);

    }

    public static void main(String args[]) {
        String s = "DemonSlayer";
        maxOccur(s);
    }
}
