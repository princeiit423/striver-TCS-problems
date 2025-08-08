package String;

public class largest_word_in_string {
    public static void largestString(String s) {
        String arr[] = s.split(" ");
        int max = 0;
        String ans = "";

        if (s == null || s.trim().isEmpty()) {
            System.out.println("no words found");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int length = arr[i].length();
            if (length > max) {
                max = length;
                ans = arr[i];
            }
        }
        System.out.println(ans + " : " + max);
    }

    public static void main(String args[]) {
        String s = "King Kholi";
        largestString(s);
    }
}
