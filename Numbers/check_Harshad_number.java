package Numbers;

public class check_Harshad_number {
    public static boolean checkHarshad(int n) {
        int copy = n;
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result += digit;
            n = n / 10;
        }
        if (n % result == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 378;
        System.out.println(checkHarshad(n));
        ;
    }
}
