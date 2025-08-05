package String;

public class sums_of_number_in_string {
    public static void sum(String s) {
        int sum = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int digit = s.charAt(i) - '0';
                temp += digit;
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String s = "1xyz23";
        sum(s);
    }
}
