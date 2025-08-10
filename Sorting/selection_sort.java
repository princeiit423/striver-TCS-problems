package Sorting;

import java.util.*;

public class selection_sort {
    public static void selectionSort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " data: ");
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

    }
}
