public class count_frequency {
    public static void frequency(int arr[]) {

        int n = arr.length;
        boolean visited[] = new boolean[n];

        for (int i = 0; i < arr.length - 1; i++) {
            if (visited[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        frequency(arr);

    }
}
