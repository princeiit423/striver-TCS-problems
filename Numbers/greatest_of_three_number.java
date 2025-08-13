package Numbers;

public class greatest_of_three_number {
    public static void checkGreater(float num1, float num2, float num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greates number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greatest number");
        } else {
            System.out.println(num3 + " is greates number");
        }
    }

    public static void main(String[] args) {
        float num1 = 21.0f;
        float num2 = 12;
        float num3 = 28.6f;
        checkGreater(num1, num2, num3);
    }
}
