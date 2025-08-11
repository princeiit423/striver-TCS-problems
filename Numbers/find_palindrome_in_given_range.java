package Numbers;

public class find_palindrome_in_given_range {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int dup = n;
        while (n > 0) {
            int lastDig = n % 10;
            rev = (rev * 10) + lastDig;
            n = n / 10;
        }
        if (rev == dup) {
            return true;
        }
        return false;
    }

    public static void palindromeRange(int min, int max) {
        for (int i = min; i < max; i++) {
            if (isPalindrome(i)) {
                int digit = i;
                System.out.print(digit + " ");
            }
        }
    }

    public static void main(String[] args) {
        int min = 100;
        int max = 150;
        palindromeRange(min, max);
    }
}
