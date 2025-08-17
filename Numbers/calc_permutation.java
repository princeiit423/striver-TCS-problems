package Numbers;

public class calc_permutation {
    public static int calcFactorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void calcPerm(int n, int r) {
        int factorial = calcFactorial(n);
        int factorial2 = calcFactorial(n - r);
        int permutation = factorial / factorial2;
        System.out.println(permutation);
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        calcPerm(n, r);
    }
}
