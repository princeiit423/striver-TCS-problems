public class remov_unsorted {
    public static void remove(int arr[]) {
        int n = arr.length;
        int visited[] = new int[n];
        for (int i = 0; i < n; i++) {
            visited[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 6, 2, 8, 9, 6, 1 };
        remove(arr);
    }
}
