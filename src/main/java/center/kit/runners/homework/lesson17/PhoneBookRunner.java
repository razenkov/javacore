package center.kit.runners.homework.lesson17;

import center.kit.app.homework.lesson17.PhoneBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class PhoneBookRunner {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if (new File("C:\\Users\\adm1n\\Documents\\KitCenter\\javacore\\Contacts.ser").exists()) {
            System.out.println("if");
            book.restoreContacts();
        } else {
            book.initPhoneBook(10);
        }
        int parsedChoice = 0;
        boolean isReadyToSwitch = false;
        boolean isExit = false;
        while (!isReadyToSwitch || !isExit) {
            System.out.println("To take a look on your contacts press 1");
            System.out.println("To search contact(by part of number) press 2");
            System.out.println("To see categories press 3");
            System.out.println("To edit contact press 4");
            System.out.println("To delete contact press 5");
            System.out.println("To exit press 6");
            String choice;
            try {
                choice = reader.readLine();
                parsedChoice = Integer.parseInt(choice);
                if (parsedChoice > 0 && parsedChoice < 6) {
                    isReadyToSwitch = true;
                }
            } catch (Exception e) {
                System.out.println("Incorrect input.Try again");
                System.out.println(e.getStackTrace());
            }
            if (isReadyToSwitch) {
                switch (parsedChoice) {
                    case 1:
                        book.showContacts();
                        break;
                    case 2:
                        System.out.println("Please enter number you want to find:");
                        try {
                            String number = reader.readLine();
                            book.searchByNumber(number);
                        } catch (Exception e) {
                            System.out.println(e.getStackTrace());
                        }
                        break;
                    case 3:
                        book.showCategories();
                        break;
                    case 4:
                        System.out.println("edit");
                        System.out.println("Program needs surname or number of contact you want to edit: ");
                        try {
                            String temp = reader.readLine();
                            if (book.isExist(temp) != -1) {
                                System.out.println("To edit name press 1");
                                System.out.println("To edit surname press 2");
                                System.out.println("To edit number press 3");
                                System.out.println("To edit category press 4");

                                int choice2 = book.getInputToiInt();
                                switch (choice2) {
                                    case 1:
                                        System.out.println("Enter name:");
                                        book.getContacts().get(book.isExist(temp)).setName(book.getInputToString());
                                        break;
                                    case 2:
                                        System.out.println("Enter surname:");
                                        book.getContacts().get(book.isExist(temp)).setSurname(book.getInputToString());
                                        break;
                                    case 3:
                                        System.out.println("Enter number:");
                                        book.getContacts().get(book.isExist(temp)).setNumber(book.getInputToString());
                                        break;
                                    case 4:
                                        System.out.println("Enter category:");
                                        book.getContacts().get(book.isExist(temp)).setCategory(book.getInputToString());
                                        break;
                                }

                            } else {
                                System.out.println("Contact does not exist.");
                            }

                        } catch (Exception e) {
                            System.out.println(e.getStackTrace());
                        }
                        break;
                    case 5:
                        System.out.println("Please enter name you want to erase:");
                        try {
                            String nameToErase = reader.readLine();
                            book.deleteContactByName(nameToErase);
                        } catch (Exception e) {
                            System.out.println(e.getStackTrace());
                        }
                        break;
                    case 6:
                        System.out.println("EXIT");
                        isExit = true;
                        break;
                }
            }
            book.saveContacts();
        }
    }
}
