import java.util.Stack;

public class next_greater_element_02 {
    static void findNextGreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static void main(String[] args) {
        // input arr={4,1,8,6}
        // output arr={8,8,-1,,-1} // right side me dekhna h koi greater hai y nahi
        int arr[] = { 6, 8, 0, 1 };
        findNextGreater(arr);
    }
}
