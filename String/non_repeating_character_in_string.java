package String;

import java.util.HashMap;

public class non_repeating_character_in_string {
    public static void nonRepeatChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        String s = "google";
        nonRepeatChar(s);
    }
}
