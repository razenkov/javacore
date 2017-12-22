package center.kit.app.homework.lesson11_1;

/*Реализовать класс WhiteCollar, который наследует Human и в конструкторе принимает значения возраста,
имени и компании, при этом вызывая родительский конструктор для сохранения в приватные поля имени и возраста.
Реализовать сеттер setCompany (String string), который сохраняет в поле companyName введенное значение,
если оно состоит только из латинских символов, тире, пробела и/или запятых. В противном случае выводится
сообщение “Company name is invalid”.*/

import center.kit.app.homework.lesson13.Human;

public class WhiteCollar extends Human {
    private String companyName;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        setCompany(company);
    }

    public void setCompany(String company) {
        if (company.matches("[a-zA-Z_\\,_ \\-]+")) {
            this.companyName = company;
        } else {
            System.out.println("Company name is invalid");
        }
    }

    public String getCompanyName() {
        return companyName;
    }
}
