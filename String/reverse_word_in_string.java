package String;

public class reverse_word_in_string {
    public static void reverseWord(String s) {
        StringBuffer sb = new StringBuffer();
        String[] arr = s.trim().split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }

    public static void main(String args[]) {
        String s = "this is an amazing program";
        reverseWord(s);
    }
}
