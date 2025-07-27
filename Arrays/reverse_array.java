import java.util.*;

public class reverse_array {
    public static void reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, 6, 1, 7, 8 };
        reverse(arr);
    }
}
