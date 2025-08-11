package Sorting;

public class quick_sort {
    public static int partition(int arr[], int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];
        int temp;
        int temp1;
        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }
        idx++;
        temp1 = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp1;

        return idx;
    }

    public static void quickSort(int arr[], int st, int end) {
        if (st < end) {
            int pivotIdx = partition(arr, st, end);
            quickSort(arr, st, pivotIdx - 1); // left half
            quickSort(arr, pivotIdx + 1, end); // right half
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 9, 7 };
        quickSort(arr, 0, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
