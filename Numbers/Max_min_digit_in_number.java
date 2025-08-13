package Numbers;

public class Max_min_digit_in_number {
    public static void maxMinDig(int n) {
        int max = 0;
        int min = 9;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            } else if (digit < min) {
                min = digit;
            }
            n = n / 10;
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int n = 3618;
        maxMinDig(n);

    }
}
