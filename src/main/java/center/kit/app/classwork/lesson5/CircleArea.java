package center.kit.app.classwork.lesson5;

public class CircleArea {

    public static double calculate(double radius) {

        double res = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is : " + res);
        return res;
    }

    public static String isBigger(double area1, double area2) {
        if (area1 != area2) {
            if (area1 > area2) {
                System.out.println("First is bigger");
                return "First.";
            } else {
                System.out.println("Second is bigger");
                return "Second.";
            }

        } else {
            System.out.println("Areas are equals.");
            return "areas are equals.";
        }
    }

    public static void isEven(int a) {
        if (a % 2 == 0) {
            System.out.println("The number " + a + " is EVEN");
        } else {
            System.out.println("The number " + a + " is NOT EVEN");
        }
    }

}