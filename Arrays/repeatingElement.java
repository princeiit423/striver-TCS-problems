public class repeatingElement {
    public static void repeated(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("repeated element is : " + arr[i]);
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 5, 2 };
        repeated(arr);
    }
}
