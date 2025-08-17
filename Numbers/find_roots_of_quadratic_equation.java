package Numbers;

public class find_roots_of_quadratic_equation {
    public static double calcDescriminant(int a, int b, int c) {
        double d = (b * b) - (4 * a * c);
        return d;
    }

    public static void calcEqation(int a, int b, int c) {
        double des = calcDescriminant(a, b, c);

        if (des > 0) {
            double root1 = (-b + Math.sqrt(Math.abs(des))) / 2 * a;
            double root2 = (-b - Math.sqrt(Math.abs(des))) / 2 * a;
            System.out.print("Root 1: " + root1 + " " + "Root 2: " + root2);
        } else if (des < 0) {
            double root1 = (-b / 2 * a) + (Math.sqrt(Math.abs(des)) / 2 * a);
            double root2 = (-b / 2 * a) - (Math.sqrt(Math.abs(des)) / 2 * a);
            System.out.print("Root 1: " + root1 + "i" + " " + "Root 2: " + root2 + "i");
        } else {
            double root1 = -b / 2 * a;
            System.out.println("Root 1: " + root1 + " " + "Root 2: " + root1);
        }
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 4;
        calcEqation(a, b, c);
    }
}
