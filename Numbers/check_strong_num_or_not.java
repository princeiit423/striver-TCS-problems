package Numbers;

public class check_strong_num_or_not {
    public static int findFact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void checkStrong(int n) {
        int copy = n;
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            int fact = findFact(digit);
            result += fact;
            n = n / 10;
        }
        if (copy == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String args[]) {
        int n = 145;
        checkStrong(n);

    }
}
