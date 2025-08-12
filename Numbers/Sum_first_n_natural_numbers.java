package Numbers;

public class Sum_first_n_natural_numbers {

    public static void sumNumber(int n) { // this take O(1) time complexity
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    public static void sumNum(int n) { // this take O(n) time complexity
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 5;
        sumNum(n);
        System.out.println("-------------------------------------");
        sumNumber(n);
    }
}
