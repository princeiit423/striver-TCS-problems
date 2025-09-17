package String;

public class count_word_in_String {
    public static void countWord(String s) {
        String[] arr = s.split(" ");

        System.out.println(arr.length);
    }

    public static void main(String[] args) {
        String s = "hi there";
        countWord(s);
    }
}
