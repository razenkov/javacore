package center.kit.app.classwork.lesson6;
import java.util.Scanner;

public class LoopsPractice {

    public static void LoopTillEqual()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number1: ");
        int a = sc.nextInt();
        System.out.println("Enter Number2: ");
        int b = sc.nextInt();

        while (a>b) {
            a--;
            System.out.println("A = " + a + " B = " + b);
        }
        System.out.println("A == B");
        System.out.println("A = " + a + " B = " + b);
    }


}
