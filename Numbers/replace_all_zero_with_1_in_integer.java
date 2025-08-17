package Numbers;

public class replace_all_zero_with_1_in_integer {
    public static void replaceZero(int n) {
        int rev = 0;
        if (n == 0) {
            System.out.println(1);
        }
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                digit = 1;
            }
            rev = (rev * 10) + digit;
            n = n / 10;
        }

        while (rev > 0) {
            int dig = rev % 10;
            System.out.print(dig);
            rev = rev / 10;
        }
    }

    public static void main(String[] args) {
        int n = 1230;
        replaceZero(n);
    }
}
