public class adding_element {
    public static void inserAtBegining(int arr[], int key) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = key;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("-----------------------");
    }

    public static void insertAtEnding(int arr[], int key) {
        int n = arr.length;
        int newArr[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = key;
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("----------------------------");
    }

    public static void insertAtPos(int arr[], int val, int pos) {
        int n = arr.length;
        int newArr[] = new int[n + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = val;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("-----------------------------");
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        inserAtBegining(arr, 6);
        insertAtEnding(arr, 7);
        insertAtPos(arr, 9, 2);
    }
}
