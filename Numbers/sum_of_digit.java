package Numbers;

public class sum_of_digit {
    public static void sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 321;
        sumDigit(n);
    }
}
