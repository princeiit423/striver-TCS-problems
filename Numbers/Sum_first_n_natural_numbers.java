package Numbers;

public class Sum_first_n_natural_numbers {
    public static void sumNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 89;
        sumNum(n);
    }
}
