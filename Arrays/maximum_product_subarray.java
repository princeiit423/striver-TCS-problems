public class maximum_product_subarray {
    public static void maxProd(int arr[]) {
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, ans *= arr[i]);
        }
        System.out.print(ans);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 0 };
        maxProd(arr);

    }
}
