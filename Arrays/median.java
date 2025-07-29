import java.util.*;

public class median {
    public static void main(String args[]) {
        int arr[] = { 2, 5, 1, 7 };
        Arrays.sort(arr);
        int n = arr.length - 1;
        if (n % 2 != 0) {
            System.out.println(arr[(n + 1) / 2]);
        } else {
            System.out.println(arr[n / 2]);
        }

    }
}
