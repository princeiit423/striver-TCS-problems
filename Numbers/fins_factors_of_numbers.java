package Numbers;

public class fins_factors_of_numbers {
    public static void calcFactor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 21;
        calcFactor(n);
    }
}
