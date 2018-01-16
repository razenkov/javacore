package center.kit.runners.homework.lesson19;

import center.kit.app.homework.lesson19.ArraySorterGenerics;
import center.kit.app.homework.lesson5.ArraySort;

import java.util.Arrays;
import java.util.Random;

public class ArraySorterGenericsRunner {
    public static void main(String[] args) {
        int sizeOfTestArray = 5;
        Random r = new Random();

        Double[] doubleArr = new Double[sizeOfTestArray];
        for (int i = 0; i < sizeOfTestArray; ++i) {
            doubleArr[i] = r.nextDouble() * 10;
        }

        Integer[] intArr = new Integer[sizeOfTestArray];
        for (int i = 0; i < sizeOfTestArray; ++i) {
            intArr[i] = r.nextInt();
        }

        Short[] shortArr = new Short[sizeOfTestArray];
        for (int i = 0; i < sizeOfTestArray; ++i) {
            shortArr[i] = (short) r.nextInt();
        }

        Long[] longArr = new Long[sizeOfTestArray];
        for (int i = 0; i < sizeOfTestArray; ++i) {
            longArr[i] = r.nextLong();
        }

        //sorted by static method
        ArraySorterGenerics.sort(doubleArr);
        System.out.println(Arrays.toString(doubleArr));

        //sorted by non static method
        System.out.println(Arrays.toString(new ArraySorterGenerics<>(intArr).getArray()));

        ArraySorterGenerics.sort(shortArr);
        System.out.println(Arrays.toString(shortArr));

        System.out.println(Arrays.toString(new ArraySorterGenerics<>(longArr).getArray()));
    }
}
