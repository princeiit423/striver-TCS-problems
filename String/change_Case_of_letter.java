package String;

public class change_Case_of_letter {
    public static void changeCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            if (ascii >= 97 && ascii <= 122) {
                char letter = (char) (ascii - 32);
                sb.append(letter);
            } else if (ascii == ' ') {
                sb.append(" ");
            } else {
                char letter1 = (char) (ascii + 32);
                sb.append(letter1);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String s = "Faiz Hussain";
        changeCase(s);
    }
}
