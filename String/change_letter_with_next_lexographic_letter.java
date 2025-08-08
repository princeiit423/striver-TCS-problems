package String;

public class change_letter_with_next_lexographic_letter {
    public static void changeLexi(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int[] map = new int[n];
        for (int i = 0; i < s.length(); i++) {
            map[i] = s.charAt(i) - 'a';
        }
        for (int i = 0; i < map.length; i++) {
            if ((char) (map[i] + 'a') == 'z') {
                sb.append('a');
            } else {
                char letter = (char) (map[i] + 'a' + 1);
                sb.append(letter);
            }
        }
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        String s = "Java";
        changeLexi(s);

    }
}
