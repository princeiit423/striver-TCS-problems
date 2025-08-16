package Numbers;

public class check_automorphic_number {
    public static void checkAutomorphic(int n) {
        double root = Math.pow(n, 2);
        double lastdigRoot = root % 10;
        double lastdigit = n % 10;

        if (lastdigRoot == lastdigit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        int n = 76;
        checkAutomorphic(n);

    }
}
