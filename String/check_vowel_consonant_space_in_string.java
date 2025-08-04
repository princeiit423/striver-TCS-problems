package String;

public class check_vowel_consonant_space_in_string {
    public static void check(String s) {
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                vowels++;
            } else if (s.charAt(i) == ' ') {
                spaces++;
            } else {
                consonants++;
            }
        }
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("spaces: " + spaces);
    }

    public static void main(String args[]) {
        String s = "hi i am faiz";
        check(s);
    }
}
