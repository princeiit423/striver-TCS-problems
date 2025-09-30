import java.util.Stack;

public class valid_parenthesis_03 {
    public static boolean isValid(char arr[]) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            }
            if (stack.isEmpty()) {
                return false;
            } else {
                if (stack.peek() == '(' && arr[i] == ')' || stack.peek() == '[' && arr[i] == ']'
                        || stack.peek() == '{' && arr[i] == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        char arr[] = { '}', ')', ')', '}' };
        System.out.println(isValid(arr));
        ;

    }
}
