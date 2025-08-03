import java.util.*;

public class sort_elemnt_by_frequency {
    public static void sortFrequency(int arr[]) {
        // find frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // create list of elemnt
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        result.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return freqB - freqA;
            } else {
                return a - b;
            }
        });

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 2, 4, 3, 1, 2 };
        sortFrequency(arr);
    }
}