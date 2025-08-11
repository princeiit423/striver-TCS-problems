package Numbers;

public class check_armstrong_or_not {
    public static void checkArmstrong(int n) {
        int ans = 0;
        int dup = n;
        while (n > 0) {
            int lastDig = n % 10;
            ans = ans + (lastDig * lastDig * lastDig);
            n = n / 10;
        }
        if (ans == dup) {
            System.out.println("It is armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }

    public static void main(String[] args) {
        int n = 371;
        checkArmstrong(n);

    }
}
