package Numbers;

public class greatest_of_two_numbers {
    public static void checkGreater(float num1, float num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num1 + " not greater");
        }
    }

    public static void main(String[] args) {
        float num1 = 1.4f;
        float num2 = 1.2f;
        checkGreater(num1, num2);
    }
}
