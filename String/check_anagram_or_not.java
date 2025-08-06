package String;

import java.util.HashMap;

public class check_anagram_or_not {
    public static void checkAnagram(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (s1.length() != s2.length()) {
            System.out.println("False");
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if (map1.equals(map2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void main(String args[]) {
        String s1 = "CAT";
        String s2 = "ACT";
        checkAnagram(s1, s2);
    }
}
