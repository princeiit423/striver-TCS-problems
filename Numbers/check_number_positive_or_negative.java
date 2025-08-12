package Numbers;

public class check_number_positive_or_negative {
    public static void checkPosNeg(int n) {
        if (n >= 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static void main(String[] args) {
        int n = -231;
        checkPosNeg(n);

    }
}
