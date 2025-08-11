package Numbers;

public class check_prime {
    public static void checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }

    public static void main(String[] args) {
        int n = 47;
        checkPrime(n);
    }
}
