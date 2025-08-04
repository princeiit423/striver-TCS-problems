package String;

public class remove_vowel_in_string {
    public static void remove(String s) {
        String result = s.replaceAll("[aeiousAEIOU]", "");
        System.out.println(result);
    }

    public static void main(String args[]) {
        String s = "bananna";
        remove(s);

    }
}
