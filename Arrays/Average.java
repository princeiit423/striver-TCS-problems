public class Average {
    public static void main(String args[]) {
        float sum = 0;
        int arr[] = { 1, 2, 1, 1, 5, 1 };
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum / arr.length);
    }
}
