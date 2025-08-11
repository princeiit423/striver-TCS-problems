package Numbers;

public class Number_palindrome_or_not {
    public static void checkPalindrome(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int lastDig = n % 10;
            revNum = (revNum * 10) + lastDig;
            n = n / 10;
        }
        if (revNum == dup) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {
        int n = 4554;
        checkPalindrome(n);
    }
}
