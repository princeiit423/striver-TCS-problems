import java.util.*;

public class smallest_in_array {
    public static void main(String args[]) {
        int arr[] = { 4, 3, 1, 8, 9 };
        Arrays.sort(arr);
        System.out.print("Smallest number is : " + arr[0]);
    }
}