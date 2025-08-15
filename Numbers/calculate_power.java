package Numbers;

public class calculate_power {
    public static void calcPower(int n, int power) {
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans = ans * n;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 2;
        int power = 9;
        calcPower(n, power);
    }
}
