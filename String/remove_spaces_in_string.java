package String;

public class remove_spaces_in_string {
    public static void removeSpace(String s) {
        String result = s.replaceAll(" ", "");
        System.out.println(result);
    }

    public static void main(String args[]) {
        String s = "Hi i am faiz";
        removeSpace(s);
    }
}
