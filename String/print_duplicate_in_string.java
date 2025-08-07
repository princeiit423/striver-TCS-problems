package String;

import java.util.LinkedHashMap;

public class print_duplicate_in_string {
    public static void printDup(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " : " + map.get(key));
            }
        }
    }

    public static void printDupArrLogic(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) (i + 'a') + " : " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "sinstriiintng";
        printDup(s);
        System.out.println("-------------------------------------------");
        printDupArrLogic(s);
    }
}
