package String;

public class capitalize_first_last_letter_in_string {

    public static void capitalise(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int len = word.length();
            // System.out.println(len);
            if (len == 1) {
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                result.append(Character.toUpperCase(word.charAt(0))); // First letter
                result.append(word.substring(1, len - 1)); // Middle part
                result.append(Character.toUpperCase(word.charAt(len - 1))); // Last letter
            }
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        String s = "take u forward is awesome";
        capitalise(s); // Output: "TakE U ForwarD IS AwesomE"
    }
}
