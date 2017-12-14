package center.kit.runners.homework.lesson6;

import center.kit.app.classwork.lesson5.CircleArea;
import center.kit.app.classwork.lesson5.Triangle;
import center.kit.app.homework.lesson6.UserMenuWithContinuousWorkability;

import java.util.Scanner;

//Подумать как можно было бы сделать программу так, чтобы:
// - программа завершалась командой из меню, и можно было бы работать без перезапуска
//   с разными вычислениями по очереди
// - меню и методы расчетов находились в разных классах программы
// - предотвращать сбои в программе (например при случайном вводе не-числового значения)

public class UserMenuWithContinuousWorkabilityRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserMenuWithContinuousWorkability.showUserMenu();

        boolean isExit = false;

        while (!isExit) {
            //Variable for work with switch
            int choice;
            //To avoid exception while parsing
            try {
                //Integer.parseInt for handle input of non-numeric values
                choice = Integer.parseInt(sc.next());
                if (choice < 0 || choice > 3) {
                    System.out.println("Please enter correct value:");
                    System.out.flush();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Please enter correct value:");
                continue;
            }
            switch (choice) {
                case 0:
                    //Here is exit from 'while' loop
                    isExit = true;
                    break;
                case 1:
                    System.out.println("Let's define sides of triangle : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    if (Triangle.isRightAngled(a, b, c)) {
                        System.out.println("Triangle is Right Angled.");
                    } else {
                        System.out.println("Triangle is NOT Right Angled.");
                    }
                    break;
                case 2:
                    System.out.println("To calculate circle area please enter circle radius: ");
                    double radius = sc.nextDouble();
                    CircleArea.calculate(radius);
                    break;
                case 3:
                    System.out.println("Enter first number :");
                    double first = sc.nextDouble();
                    System.out.println("Enter second number :");
                    double second = sc.nextDouble();
                    CircleArea.isBigger(first, second);
                    break;
            }
            UserMenuWithContinuousWorkability.showUserMenu();
        }
        System.out.println("Exit.");
    }
}
