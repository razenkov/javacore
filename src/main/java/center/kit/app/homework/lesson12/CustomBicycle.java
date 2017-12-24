package center.kit.app.homework.lesson12;

/*Написать класс CustomBicycle который будет наследовать
Bicycle и имплементировать методы setSpeed() и setGear(),
которые будут сохранять данные в поля класса int speed и int gear,
после чего выводить соответствующие значения на экран. */

public class CustomBicycle extends Bicycle {
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed = " + speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear = " + gear);
    }

    @Override
    public void ride() {
        System.out.println("Wshhhh");
    }
}
