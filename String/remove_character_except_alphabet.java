package String;

public class remove_character_except_alphabet {
    public static void removeCharacter(String s) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                ans.append(s.charAt(i));
            }
        }
        System.out.println(ans.toString());

    }

    public static void main(String[] args) {
        String s = "Charizard*%is@#4legendar$y*pokemon";
        removeCharacter(s);
    }
}
