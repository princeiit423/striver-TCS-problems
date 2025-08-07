package String;

public class removeDuplicate_in_String {
    public static void removeDup(String s) {
        boolean[] map = new boolean[26];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i) - 'a'] == false) {
                ans += s.charAt(i);
                map[s.charAt(i) - 'a'] = true;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "takeuforward";
        removeDup(s);
    }
}
