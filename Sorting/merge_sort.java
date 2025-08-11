package Sorting;

import java.util.ArrayList;

public class merge_sort {

    public static void merge(int arr[], int st, int mid, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = st;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                list.add(arr[i]);
                i++;
            } else {
                list.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            list.add(arr[i]);
            i++;
        }
        while (j <= end) {
            list.add(arr[j]);
            j++;
        }

        for (int k = 0; k < list.size(); k++) {
            arr[st + k] = list.get(k);
        }
    }

    public static void mergeSort(int arr[], int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;
            mergeSort(arr, st, mid); // left half
            mergeSort(arr, mid + 1, end); // right half

            merge(arr, st, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 7, 5, 9 };
        mergeSort(arr, 0, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
