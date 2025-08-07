package String;

import java.util.LinkedHashMap;

public class removeDuplicate_in_String {
    public static void removeDup(String s) {
        boolean[] map = new boolean[26];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i) - 'a'] == false) {
                ans += s.charAt(i);
                map[s.charAt(i) - 'a'] = true;
            }
        }
        System.out.println(ans);
    }

    public static void hashRemove(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0));
        }
        for (char key : map.keySet()) {

            if (map.get(key) > 1) {
                ans += key;
            } else {
                ans += key;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "takeuforward";
        removeDup(s);
        System.out.println("-----------------------------------");
        hashRemove(s);
    }
}
