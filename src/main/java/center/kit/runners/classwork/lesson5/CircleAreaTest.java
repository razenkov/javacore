package center.kit.runners.classwork.lesson5;

import center.kit.app.classwork.lesson5.CircleArea;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class CircleAreaTest {
    public static void main(String[] args) {

        System.out.println("Enter radius of circle u want to draw)");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        CircleArea.calculate(radius);
        double res = Math.PI * Math.pow(radius, 2);
        System.out.println("Result is: " + res);

        double area1 = 12.2221;
        double area2 = 12.2222;
        System.out.println(CircleArea.CircleAreaComparer(area1, area2));

        CircleArea.isEven(5);
        CircleArea.isEven(10);



    }
}
