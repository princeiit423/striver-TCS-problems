// write a program to hift first and last digit of each elements at last of digit elements

import java.util.ArrayList;

public class shift_last_first_digit_to_last_of_digit_of_array {
    public static int shiftDigit(int num) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (num > 0) {
            int digit = num % 10;
            list.add(digit);
            num = num / 10;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        for (int i = 1; i < list2.size() - 1; i++) {
            ans = (ans * 10) + list2.get(i);
        }
        ans = (ans * 10) + list2.get(0);
        ans = (ans * 10) + list2.get(list2.size() - 1);
        return ans;
    }

    public static void convertArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int number = shiftDigit(arr[i]);
            System.out.print(number + ", ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 123, 235, 6754, 3257, 54, 2367, 288, 35, 645, 374, 56 };
        convertArray(arr);

    }
}