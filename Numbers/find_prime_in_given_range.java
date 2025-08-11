package Numbers;

public class find_prime_in_given_range {
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static void primeInRange(int min, int max) {
        for (int i = min; i < max; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 100000;
        primeInRange(min, max);
    }
}
