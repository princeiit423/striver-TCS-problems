package Numbers;

public class check_perfect_square_or_not {
    public static void checkSquare(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        checkSquare(n);
    }
}
