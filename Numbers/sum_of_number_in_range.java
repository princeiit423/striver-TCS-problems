package Numbers;

public class sum_of_number_in_range {
    public static void sumRange(int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 7;
        sumRange(n1, n2);
    }
}
