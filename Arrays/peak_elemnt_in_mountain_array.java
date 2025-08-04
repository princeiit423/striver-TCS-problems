public class peak_elemnt_in_mountain_array {
    public static void peakElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 0, 2, 1, 0 };
        peakElement(arr);
    }
}
