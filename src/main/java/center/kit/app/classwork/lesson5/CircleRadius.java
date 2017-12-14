package center.kit.app.classwork.lesson5;

import java.util.Scanner;

public class CircleRadius {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();

        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is " + circleArea);
    }


}
