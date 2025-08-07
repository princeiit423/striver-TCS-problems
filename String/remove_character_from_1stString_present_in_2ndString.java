package String;

public class remove_character_from_1stString_present_in_2ndString {
    public static void remStr(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            int flag = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    flag = 1;
                }
            }
            if (flag != 1) {
                ans.append(s1.charAt(i));
            }
        }
        System.out.println(ans.toString());

    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cefz";
        remStr(s1, s2);
    }
}
