package String;

import java.util.ArrayList;

public class find_position_of_substring_in_string {
    public static void calcPosition(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                arr.add(i);
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(arr.get(0));
    }

    public static void main(String[] args) {
        String s1 = "faizhussain";
        String s2 = "huss";
        calcPosition(s1, s2);
    }
}
