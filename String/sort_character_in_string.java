package String;

import java.util.Arrays;

public class sort_character_in_string {
    public static void sortChar(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String ans = new String(arr);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "faiz";
        sortChar(s);
    }
}
