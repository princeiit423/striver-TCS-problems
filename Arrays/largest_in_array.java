import java.util.*;

public class largest_in_array {
    public static void main(String args[]) {
        int arr[] = { 5, 7, 1, 3, 9, 89, 13, 45 };
        Arrays.sort(arr);
        System.out.print("largest array is: " + arr[arr.length - 1]);
    }
}
