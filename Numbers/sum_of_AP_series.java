package Numbers;

public class sum_of_AP_series {
    public static void sumAP(int n, float a, float d) {
        float sum = (n / 2.0f) * (2.0f * a + (n - 1) * d);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a = 2;
        int d = 2;
        int n = 4;
        sumAP(n, a, d);
    }
}
