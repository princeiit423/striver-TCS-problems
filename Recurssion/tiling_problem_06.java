public class tiling_problem_06 {
    public static int findTiling(int n) { // 2*n floor size

        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical chocie
        int fnm1 = findTiling(n - 1);
        // horizontal choice
        int fnm2 = findTiling(n - 2);

        int totWay = fnm1 + fnm2;
        return totWay;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(findTiling(n));
    }
}
