public class sum_of_element_of_array {
    public static void sumElement(int arr[], int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 7, 5, 2, 8, 6 };
        int index = 7;
        sumElement(arr, index);
    }
}