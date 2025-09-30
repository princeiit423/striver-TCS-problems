import java.util.*;

public class reverse_array_using_stack_01 {
    static void reverseArray(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
    }
}