package Numbers;

public class factorial_of_number {
    public static void fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 3;
        fact(n);
    }
}
