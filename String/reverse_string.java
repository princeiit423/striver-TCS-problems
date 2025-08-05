package String;

public class reverse_string {
    public static void reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String s = "faiz";
        reverse(s);
    }
}
