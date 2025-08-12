package Numbers;

public class Even_or_Odd {
    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        int n = 22;
        checkEvenOdd(n);
    }
}
