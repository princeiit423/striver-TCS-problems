public class factorial_01 {
    public static int findfact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = findfact(n - 1);
        return n * fnm1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(findfact(n));
    }
}
