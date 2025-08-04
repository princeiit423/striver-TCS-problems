package String;

import java.util.*;

public class palindrome_or_not {
    public static void isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not a palindrome");
                return;
            } else {
                left++;
                right--;
            }
        }
        System.out.println("it is a palindrome");
    }

    public static void main(String args[]) {
        String s = "racecar";
        isPalindrome(s);
    }
}
