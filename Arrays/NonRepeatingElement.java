import java.util.*;

public class NonRepeatingElement {
    public static void nonRepeating(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Print non-repeating elements
        for (int num : arr) {
            if (freq.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, -1, 1, 3, 1 };
        nonRepeating(arr); // Output: 2 -1 3
    }
}
