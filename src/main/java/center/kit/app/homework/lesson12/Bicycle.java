package center.kit.app.homework.lesson12;

/*Написать абстрактный класс Bicycle с реализованным
методом public void ride(), абстрактными методaми setSpeed()
и setGear(). Метод ride() выводит на экран строку “Wroom!”. */

public abstract class Bicycle {
    protected int speed;
    protected int gear;

    public void ride() {
        System.out.println("Wroom!");
    }

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);
}

