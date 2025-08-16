package Numbers;

public class find_GCD_of_number {
    public static void checkGCD(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 21;
        checkGCD(n1, n2);
    }
}
