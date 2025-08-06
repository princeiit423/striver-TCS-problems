package String;

import java.util.HashMap;

public class calculate_freq_of_character_string {
    public static void calFreq(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + freq[i]);
            }
        }
    }

    // using hashmap
    public static void mapCalc(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void main(String args[]) {
        String s = "takeuforward";
        calFreq(s);
        // mapCalc(s);
    }
}