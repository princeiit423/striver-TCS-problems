package String;

public class remove_bracket_in_algebric_expression {
    public static void removeBracket(String s) {
        String ans = s.replaceAll("[(,)]", "");
        System.out.println(ans);
    }

    public static void main(String args[]) {
        String s = "a+((b-c)+d)";
        removeBracket(s);
    }
}
