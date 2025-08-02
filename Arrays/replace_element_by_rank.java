import java.util.*;

public class replace_element_by_rank {
    public static void replacement(int arr[]) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == sorted[j]) {
                    int ans = j + 1;
                    System.out.print(ans + ",");
                    break;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 20, 15, 26, 2, 98, 6 };
        replacement(arr);

    }
}
