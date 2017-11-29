package center.kit.app.classwork.lesson5;

public class CircleArea {

    public static double calculate(double radius){

        double res = Math.PI * Math.pow(radius, 2);
        return res;
    }

    public static String CircleAreaComparer(double area1, double area2) {

        if (area1 != area2) {

            if (area1 > area2) {
                return "First.";
            } else {
                return "Second.";
            }

        }else {
                return "areas are equals.";
        }
    }
}