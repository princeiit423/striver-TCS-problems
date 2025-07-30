public class Two_Sum_two_pointer {
    public static void twoSum(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currSum = arr[left] + arr[right];
            if (currSum == target) {
                System.out.print(left + "," + right);
                break;
            } else if (currSum > target) {
                right--;
            } else {
                left++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 8, 11, 12, 14 };
        int target = 20;
        twoSum(arr, target);

    }
}
