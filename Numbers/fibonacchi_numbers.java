package Numbers;

public class fibonacchi_numbers {
    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // print current
            int next = a + b; // next term
            a = b; // shift
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printFibonacci(n);
    }
}
