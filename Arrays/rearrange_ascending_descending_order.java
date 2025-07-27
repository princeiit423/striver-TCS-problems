import java.util.*;

public class rearrange_ascending_descending_order {
    public static void rearrange(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < (arr.length / 2); i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= (arr.length / 2); i--) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, 8, 6, 15, 5, 9, 20 };
        rearrange(arr);
        // System.out.print(arr.length);

    }
}
