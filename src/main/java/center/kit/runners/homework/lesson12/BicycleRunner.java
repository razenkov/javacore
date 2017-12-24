package center.kit.runners.homework.lesson12;

import center.kit.app.homework.lesson12.BicycleWithRing;
import center.kit.app.homework.lesson12.CustomBicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        /*Вызвать метод ring() из обьекта класса BicycleWithRing
        через референс типа BicycleWithRingInterface. */

        BicycleWithRing bicycleWithRing = new BicycleWithRing();
        bicycleWithRing.ring();

        /*Вызвать методы setGear() и ride() из обьекта класса
        CustomBicycle через референс класса Bicycle. В классе
        CustomBicycle метод ride() должен выводить на экран
        строку “Wshhhh!”.*/

        CustomBicycle customBicycle = new CustomBicycle();
        customBicycle.setGear(6);
        customBicycle.setSpeed(200);
        customBicycle.ride();
    }
}
