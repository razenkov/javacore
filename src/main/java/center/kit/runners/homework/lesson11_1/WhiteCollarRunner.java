package center.kit.runners.homework.lesson11_1;

import center.kit.app.homework.lesson11_1.WhiteCollar;

import java.util.Scanner;

public class WhiteCollarRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of worker:");
        String name = sc.next();
        System.out.println("Please enter worker's age:");
        int age = sc.nextInt();
        System.out.println("Please enter name of company. \nNOTE: Company name should contain a-z, '-', ',', and space symbols.");
        String company = sc.next();

        WhiteCollar wc = new WhiteCollar(age, name, company);
        System.out.println("Worker name: " + wc.getName() + "\nAge: " + wc.getAge() + "\nName of company: " + wc.getCompanyName());
    }
}
