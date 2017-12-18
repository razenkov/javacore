package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson8.StringPractice;

import java.util.Scanner;
//Schoology_lesson8
public class StringPracticeRunner {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the word to isPalindrome check: ");
            String input = sc.next();
            StringPractice.isPalindrome1(input);
            StringPractice.isPalindrome2(input);
            StringPractice.isPalindrome3(input);
            StringPractice.isPalindrome4(input);
        }
    }
}
