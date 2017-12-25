package center.kit.app.homework.lesson12_1;

/*Реализовать игру “Угадай-ка”, которая будет выводить случайным образом
ФИО одного из известных людей и предлагать пользователю ввести его возраст.
В случае совпадения - выводим пользователю поздравление, в противном случае
- сообщаем что он неправ и выводим случайным образом ФИО другого известного человека.
ФИО не должно повторяться два раза подряд.

Задачу можно усложнить, спрашивая у пользователя не только возраст,
а также то - жив ли этот человек или уже нет. Игра должна завершаться после
трех угаданных людей.*/

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;
import java.util.Scanner;

public class GuessFamous {
    public void showMenuToUser() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Famous> alreadyGuessed = new ArrayList<>();
        Famous previousPerson = getRandomPerson();
        while (alreadyGuessed.size() != Famous.values().length) {//till user not guessed all the list
            System.out.println("Try to guess when next person was born:");

            Famous person = getRandomPerson();
            while ((isPersonInTheList(alreadyGuessed, person)) ||
                    ((person == previousPerson) &&
                            alreadyGuessed.size() != Famous.values().length - 1)) {
                person = getRandomPerson();
            }
            previousPerson = person;
            System.out.println(person);
            int yearOfBorn = safelyGetUserInputStringToInt();

            if (yearOfBorn == person.getBornYear()) {
                System.out.println("You are absolutely right!");
                alreadyGuessed.add(person);
                System.out.println("Is he/she alive? Type true or false");
                Boolean answer = safelyGetUserInputStringToBool();
                if (answer.equals(person.getIsLive())) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No. But now you know the answer.");
                }
            } else {
                System.out.println("No, it is not correct");
            }
        }
        if (alreadyGuessed.size() == Famous.values().length) {
            System.out.println("CONGRATULATIONS");
        }
        sc.close();
    }

    public Famous getRandomPerson() {
        ArrayList<Famous> list =
                new ArrayList<>(EnumSet.allOf(Famous.class));

        Random r = new Random();
        int choice = r.nextInt(list.size());
        while (choice < 0) {
            choice = r.nextInt(list.size());
        }
        return list.get(choice);
    }

    public boolean isPersonInTheList(ArrayList<Famous> list, Famous person) {
        boolean isHere = false;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == person) {
                isHere = true;
            }
        }
        return isHere;
    }

    public boolean safelyGetUserInputStringToBool() {
        boolean isReadyToReturn = false;
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        while (!isReadyToReturn) {
            try {
                if (temp.equalsIgnoreCase("false") || temp.equalsIgnoreCase("true")) {
                    isReadyToReturn = true;
                } else {
                    System.out.println("Please enter correct value:");
                    temp = sc.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Please enter correct value:");
                System.out.println(e.getStackTrace());
                temp = sc.nextLine();
            }
        }

        if (temp.equalsIgnoreCase("true")) {
            return true;
        } else {
            return false;
        }
    }

    public int safelyGetUserInputStringToInt() {
        int retValue = -1;
        boolean isReadyToReturn = false;
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        while (!isReadyToReturn) {
            try {
                retValue = Integer.parseInt(temp);
                isReadyToReturn = true;
            } catch (Exception e) {
                System.out.println("Please enter correct value:");
                temp = sc.nextLine();
            }
        }
        return retValue;
    }
}

