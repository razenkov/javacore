package center.kit.runners.homework.lesson13;

import center.kit.app.homework.lesson13.Human;

public class HumanRunner {
    public static void main(String[] args) {
        String name = "Bill";
        int age = -1;
        Human human = new Human(age, name);
        System.out.println("Human name is: " + human.getName());
        System.out.println("Human age is: " + human.getAge());

        String name2 = "Bob";
        int age2 = 120;
        Human human2 = new Human(age2, name2);
        System.out.println("Human2 name is: " + human2.getName());
        System.out.println("Human2 age is: " + human2.getAge());

    }
}
