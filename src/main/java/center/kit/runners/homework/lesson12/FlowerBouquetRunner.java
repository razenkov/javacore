package center.kit.runners.homework.lesson12;

import center.kit.app.homework.lesson12.*;

import java.util.ArrayList;
import java.util.Random;

public class FlowerBouquetRunner {
    public static void main(String[] args) {
        //Create bouquet
        ArrayList<Flower> bouquet = new ArrayList<>();
        Random r = new Random();
        //Fill bouquet
        for (int i = 0; i < 100; ++i) {
            int flower = r.nextInt(4);
            while (flower < 0) {
                flower = r.nextInt(4);
            }
            switch (flower) {
                case 1:
                    bouquet.add(new Rose(r.nextDouble() * 10));
                    //bouquet.add(new Rose(r.nextDouble() * 10));
                    break;
                case 2:
                    bouquet.add(new Carnation(r.nextDouble() * 10));
                    break;
                case 3:
                    bouquet.add(new Tulip(r.nextDouble() * 10));
                    break;
                default:
                    bouquet.add(new Chamomile(r.nextDouble() * 10));
                    break;
            }
        }
        //Show bouquet
        for (int i = 0; i < bouquet.size(); ++i) {
            bouquet.get(i).getFlowerInfo();
        }
        //Count price of bouquet
        double priceOfBouquet = 0;
        for (int i = 0; i < bouquet.size(); ++i) {
            priceOfBouquet += bouquet.get(i).getPrice();
        }
        System.out.println("priceOfBouquet = " + priceOfBouquet);
    }

}
