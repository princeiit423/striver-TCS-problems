package Numbers;

import java.util.ArrayList;

public class check_abundant_number {
    public static void checkAbundant(int n) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not abundant number");
        }
    }

    public static void main(String[] args) {
        int n = 18;
        checkAbundant(n);
    }
}
