package Numbers;

public class LCM_of_numbers {
    public static void findLCM(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (n1 * n2) / gcd;
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 18;
        findLCM(n1, n2);
    }
}
