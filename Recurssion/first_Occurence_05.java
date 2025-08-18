public class first_Occurence_05 {
    public static int firstOccu(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccu(arr, i + 1, key);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 8, 6, 2, 9, 1 };
        int key = 1;
        System.out.println(firstOccu(arr, 0, key));
    }
}
