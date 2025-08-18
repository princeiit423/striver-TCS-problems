public class fibonachi_number_03 {
    public static int findFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans = findFibo(n - 1) + findFibo(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFibo(n));
    }
}
