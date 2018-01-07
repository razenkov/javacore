package center.kit.app.homework.lesson17;

import java.io.Serializable;

public class Account implements Serializable {

    private String category;
    private String name;
    private String surname;
    private String number;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCategory() {
        return category;
    }

    public String getNumber() {
        return number;
    }

    Account(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.category = "default_category";
    }

}
