package center.kit.runners.classwork.lesson19;

import center.kit.app.classwork.lesson18.BoxPrinter;
import center.kit.app.classwork.lesson19.GenericPractice;
import center.kit.app.classwork.lesson19.UniversalSorter;
import java.util.Arrays;


public class GenericRunner {
    public static void main(String[] args) {
        GenericPractice<String, Integer> g1 = new GenericPractice("Bob", (Integer)912);
        GenericPractice<String, Integer> g2 = new GenericPractice<>("Bob", (Integer)912);

        System.out.println(g1.compare(g2));


        BoxPrinter<Integer> bp = new BoxPrinter<Integer>(99);
        bp.toString();

        BoxPrinter<Integer > bp2 = new BoxPrinter<Integer>(0);
        bp2.toString();


        Integer[] arr1 = new Integer[]{12,12,-12,1,235365,57,6,8,79,8,9,0};
        Double[] arr2 = new Double[]{12.2,4353.54,4545.452,-1.9,24.34,222.0,0.0};
        Short[] arr3 = new Short[]{1,2,45,2,14,120,-23,-44,-1,0};


        UniversalSorter sorter = new UniversalSorter();

        System.out.println("Before arr1:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("After:");
        sorter.sortNumbersMethod(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Before arr2:");
        System.out.println(Arrays.toString(arr2));
        System.out.println("After:");
        sorter.sortNumbersMethod(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Before arr3:");
        System.out.println(Arrays.toString(arr3));
        System.out.println("After:");
        sorter.sortNumbersMethod(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}


