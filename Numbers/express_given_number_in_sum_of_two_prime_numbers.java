package Numbers;

public class express_given_number_in_sum_of_two_prime_numbers {
    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static boolean checkNum(int n) {
        for (int i = 1; i < n / 2; i++) {
            int other = n - i;
            if (checkPrime(i) && checkPrime(other)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int n = 74;
        System.out.println(checkNum(n));
        ;
    }
}
