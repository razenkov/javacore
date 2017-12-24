package center.kit.runners.classwork.lesson13;


import center.kit.app.classwork.lesson13.Numbers;

import java.util.Scanner;

public class NumbersRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        if (choice.equals(Numbers.ONE.name())){

            System.out.println(Numbers.ONE.name());
        }else if (choice.equals(Numbers.TWO.name())){

            System.out.println(Numbers.TWO.name());
        }else if (choice.equals(Numbers.THREE.name())){

            System.out.println(Numbers.THREE.name());
        }
    }

}


