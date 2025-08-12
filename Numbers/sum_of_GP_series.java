package Numbers;

public class sum_of_GP_series {
    public static void sumGP(int n, float r, float a) {
        float sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 2; // number of terms in GP
        float r = 5; // commond Diffrence
        float a = 2; // first term

        sumGP(n, r, a);
    }
}
