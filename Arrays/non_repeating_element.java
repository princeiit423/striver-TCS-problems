public class non_repeating_element {
    public static void nonRepeating(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, -1, 1, 3, 1 };
        nonRepeating(arr);
    }
}
