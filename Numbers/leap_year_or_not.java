package Numbers;

public class leap_year_or_not {
    public static boolean checkLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int year = 1996;
        if (checkLeap(year)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
