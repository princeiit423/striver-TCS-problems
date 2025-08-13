package Numbers;

public class greatest_of_two_numbers {
    public static void checkGreater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num1 + " not greater");
        }
    }

    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 12;
        checkGreater(num1, num2);
    }
}
