package center.kit.app.homework.lesson17;

import java.io.*;
import java.util.*;

public class PhoneBook {
    ArrayList<Account> contacts;

    public ArrayList<Account> getContacts() {
        return contacts;
    }

    public void showContacts() {
        System.out.println("----CONTACTS----");
        for (Account temp : contacts) {
            System.out.println(temp.getName() + " " + temp.getSurname() + " " + " +38" + temp.getNumber() + " " + temp.getCategory());
        }
        System.out.println();
    }

    public void showContact(Account acc) {
        System.out.println(acc.getName() + " " + acc.getSurname() + " " + " +38" + acc.getNumber() + " " + acc.getCategory());
    }


    public HashSet<String> getCategories() {
        HashSet<String> listOfCategories = new HashSet<>();
        for (Account temp : contacts) {
            listOfCategories.add(temp.getCategory());
        }
        return listOfCategories;
    }

    public void showCategories() {
        HashSet<String> set = this.getCategories();
        for (String temp : set) {
            System.out.println(temp);
        }
    }

    public void deleteContactByIndex(ArrayList<Account> list, int index) {
        list.remove(index);
    }

    public void deleteContactByName(String name) {
        int counter = 0;
        for (Account temp : contacts) {
            if (temp.getName().equalsIgnoreCase(name)) {
                contacts.remove(counter);
                break;
            }
            counter++;
        }
    }

    public void initPhoneBook(int number) {
        NamesGenerator ng = new NamesGenerator();
        Random r = new Random();
        ArrayList<Account> contactList = new ArrayList<>();
        this.contacts = contactList;
        for (int i = 0; i < number; ++i) {
            contacts.add(new Account(ng.GetNewName(), ng.GetNewName(), String.valueOf(Math.abs(r.nextInt() * 100))));
        }
    }

    public void searchByName(String name) {
        for (Account temp : contacts)
            if (temp.getName().contains(name) || temp.getSurname().contains(name)) {
                showContact(temp);
            }
    }

    public void searchByNumber(String number) {
        for (Account temp : contacts)
            if (temp.getNumber().contains(number)) {
                showContact(temp);
            }
    }

    public void saveContacts() {
        try {
            File file = new File("C:\\Users\\adm1n\\Documents\\KitCenter\\javacore\\Contacts.ser");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contacts);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void restoreContacts() {
        try {
            File file = new File("C:\\Users\\adm1n\\Documents\\KitCenter\\javacore\\Contacts.ser");
            FileInputStream fileInputStream = fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Account> list = (ArrayList<Account>) objectInputStream.readObject();
            contacts = list;
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public int isExist(String arg) {
        int res = -1;
        for (int i = 0; i < contacts.size(); ++i) {
            if (contacts.get(i).getSurname().equals(arg) || contacts.get(i).getNumber().equals(arg)) {
                res = i;
            }
        }
        return res;
    }

    public int getInputToiInt() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean result = false;
        int resultToReturn = 0;
        while (!result) {
            try {
                String temp = reader.readLine();
                resultToReturn = Integer.parseInt(temp);
                result = true;
            } catch (Exception e) {
                System.out.println("Incorrect input, try again: ");
            }
        }
        return resultToReturn;
    }

    public String getInputToString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean result = false;
        String resultToReturn = null;
        while (!result) {
            try {
                String temp = reader.readLine();
                resultToReturn = temp;
                result = true;
            } catch (Exception e) {
                System.out.println("Incorrect input, try again: ");
            }
        }
        return resultToReturn;
    }
}
