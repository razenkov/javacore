package center.kit.runners.homework.lesson6;

import center.kit.app.classwork.lesson5.CircleArea;
import center.kit.app.classwork.lesson5.Triangle;
import center.kit.app.homework.lesson6.UserMenu;

import java.util.Scanner;

//An user enter the number to choose the task for the application. Ask an
//        user for a number.
//        If “1”: enter right-angled triangle program
//        If “2”: enter calculate circle area program
//        If “3”: enter what an number is bigger/smaller program
//        Other value: show error message and exit

public class UserMenuRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserMenu.showUserMenu();
        int choice = sc.nextInt();
        if (choice < 1 || choice > 3) {
            System.out.println("An error occurred due to incorrect choice. Exit.");
        } else if (choice == 1) {
            System.out.println("Let's enter sides of triangle : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (Triangle.isRightAngled(a, b, c)) {
                System.out.println("Triangle is Right Angled.");
            } else {
                System.out.println("Triangle is NOT Right Angled.");
            }
        } else if (choice == 2) {
            System.out.println("To calculate circle area please enter circle radius: ");
            double radius = sc.nextDouble();
            CircleArea.calculate(radius);
        } else if (choice == 3) {
            System.out.println("Enter first number :");
            double first = sc.nextDouble();
            System.out.println("Enter second number :");
            double second = sc.nextDouble();
            CircleArea.isBigger(first, second);
        }
    }
}
