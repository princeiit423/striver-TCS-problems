public class check_array_sorted_or_not_04 {
    public static boolean checkSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checkSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 9, 7 };
        System.out.println(checkSorted(arr, 0));
    }
}
