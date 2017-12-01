package center.kit.app.homework.lesson5;

public class MathMetods {
    //This method returns the absolute value of a double value
    public double absDouble(double aDouble) {
        return Math.abs(aDouble);
    }

    //Returns the argument decremented by one, throwing an exception if the result overflows an int
    public int decrementInt(int aInt) {
        return Math.decrementExact(aInt);
    }

    //Returns sqrt(x2 +y2) without intermediate overflow or underflow
    public double hypotViaCatheters(double x, double y) {
        return Math.hypot(x, y);
    }

    //This method computes the remainder operation on two arguments as prescribed by the IEEE 754 standard
    public double remainderOfDivision(double f1, double f2) {
        return Math.IEEEremainder(f1, f2);
    }

    //Returns the argument incremented by one, throwing an exception if the result overflows an int
    public int incrementExact(int a) {
        return Math.incrementExact(a);
    }

    //This method returns the greater of two double values
    public double returnMaxValue(double first, double second) {
        return Math.max(first, second);
    }

    //This method returns the smaller of two double values
    public double returnMinValue(double a, double b) {
        return Math.min(a, b);
    }

    //This method returns the value of the first argument raised to the power of the second argument
    public double powValue(double a, double b) {
        return Math.pow(a, b);
    }

    //This method returns the double value that is closest in value to the argument and is equal to a mathematical integer
    public double rintValue(double a) {
        return Math.rint(a);
    }

    //This method returns the correctly rounded positive square root of a double value
    public double returnSqrt(double a) {
        return Math.sqrt(a);
    }

    //This method returns the difference of the arguments, throwing an exception if the result overflows an int
    public int differenceBetween(int x, int y) {
        return Math.subtractExact(x, y);
    }
}
