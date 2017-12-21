package center.kit.runners.classwork.lesson11;

import center.kit.app.homework.lesson11.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Bicycle b2 = new Bicycle(100, 100);
        Bicycle b3 = new Bicycle(100, 99, "Green");
        Bicycle b4 = new Bicycle(44.44);


        b.showBicycle();
        b2.showBicycle();
        b3.showBicycle();
        b4.showBicycle();
    }
}
