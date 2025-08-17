package Numbers;

public class add_fraction {
    public static int findLCM(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (n1 * n2) / gcd;
        return lcm;
    }

    public static void addFraction(int num1, int num2, int den1, int den2) {
        int getLcm = findLCM(den1, den2);
        int fraction = (num1 * den2) + (num2 * den1);

        System.out.println(fraction + "/" + getLcm);
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 1;
        int den1 = 4;
        int den2 = 7;
        addFraction(num1, num2, den1, den2);

    }
}
