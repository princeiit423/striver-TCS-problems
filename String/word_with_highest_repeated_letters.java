package String;

import java.util.HashMap;

public class word_with_highest_repeated_letters {
    public static int calcRepeatLetter(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                count++;
            }
        }
        return count;
    }

    public static void highestRepeated(String s) {
        String[] arr = s.trim().split("\\s+");
        // int[] ans = new int[arr.length];
        int max = 0;
        String highestWord = "";
        for (int i = 0; i < arr.length; i++) {
            int current = calcRepeatLetter(arr[i]);
            if (current > max) {
                max = current;
                highestWord = arr[i];
            }
        }
        if (max > 0) {
            System.out.println(highestWord);
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        String s = "abcdefghij microsoft google";
        highestRepeated(s);
    }
}
