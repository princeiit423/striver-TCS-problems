public class check_arr_subset_of_another_arr {
    public static void checkSubset(int arr1[], int arr2[]) {
        boolean isSubset = true;
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
        }
        if (isSubset) {
            System.out.println("It is a subset");
        } else {
            System.out.println("Not a subset");
        }

    }

    public static void main(String args[]) {
        int arr1[] = { 1, 3, 4, 5, 2 };
        int arr2[] = { 2, 4, 3, 1, 7, 5, 15 };
        checkSubset(arr1, arr2);

    }
}
