package center.kit.runners.classwork.lesson13;

import center.kit.app.classwork.lesson13.Transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport t1 = new Transport(4, "coupe");
        Transport t2 = new Transport(6, "sedan");
        Transport t3 = new Transport(6, "sedan");

        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t3));

        System.out.println("-----------------");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());


    }
}
