package center.kit.app.classwork.lesson5;

public class Triangle {
    public static boolean isRightAngled(double a, double b, double c) {
        double cathetus1, cathetus2, hypotenuse;

        //Let's find presumed hypotenuse
        hypotenuse = (((a > b) ? a : b) > c) ? ((a > b) ? a : b) : c;

        //Let's define the first and second cathetus
        if (a == hypotenuse) {
            cathetus1 = b;
            cathetus2 = c;
        } else if (b == hypotenuse) {
            cathetus1 = a;
            cathetus2 = c;
        } else {
            cathetus1 = a;
            cathetus2 = b;
        }

        //Check for compliance with the Pythagorean theorem
        if (Math.pow(hypotenuse, 2) == (Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2))) {
            return true;
        } else {
            return false;
        }
    }
}
