
public class sum_of_natural_number_02 {
    public static int sumNum(int n) {

        if (n == 1) {
            return 1;
        }
        int sum = n + sumNum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(sumNum(n));
    }
}