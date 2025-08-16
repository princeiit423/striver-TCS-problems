package Numbers;

import java.util.ArrayList;

public class find_prime_factor_of_number {
    public static void calPrimeFactor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
            while (n % i == 0) {
                n = n / i;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        int n = 21;
        calPrimeFactor(n);

    }
}
