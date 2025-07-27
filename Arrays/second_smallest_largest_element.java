import java.util.*;

public class second_smallest_largest_element {
    public static void secondSmallest(int arr[]) {
        Arrays.sort(arr);
        System.out.println("second smallest element is : " + arr[1]);
    }

    public static void secondLargest(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Second largest element is : " + arr[(arr.length - 1) - 1]);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 8, 9, 0, 34, 54, 21 };
        secondSmallest(arr);
        secondLargest(arr);
    }
}
