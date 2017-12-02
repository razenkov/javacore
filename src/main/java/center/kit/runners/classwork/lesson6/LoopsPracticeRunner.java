package center.kit.runners.classwork.lesson6;

/*Ask user for number a and b.
        If a>b - decrease a until it becomes
        equal to b.
        Print a and b every loop.
        If a<=b - then print a and b, and
        exit program.*/

import center.kit.app.classwork.lesson6.LoopsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LoopsPracticeRunner {

    public static void main(String[] args) {

        //LoopsPractice.LoopTillEqual();
        for (int i = 0; i < 11; ++i) {
            System.out.println("i = " + i);
        }

        int count = 0;
        for (int j = 0; j < 20; ++j){
            if (j%2 == 0)
            {
                count++;
            }
        }
        System.out.println("Count : " + count);

        System.out.println("-------------------------------------------------");

        Random r = new Random();

        int size = 10;
        int [] intArr = new int[size];
        double [] doublesArr = new double[size];
        char [] charArr = new char[size];
        boolean [] boolArr = new boolean[size];

        for (int i = 0; i < size; ++i) {
            intArr[i] = r.nextInt();
            doublesArr[i] = r.nextDouble();
            charArr[i] = (char)r.nextInt();
            boolArr[i] = r.nextBoolean();
        }

        System.out.println("boolArr : ");
        for (int i = 0; i < boolArr.length; ++i){
            System.out.println(boolArr[i]);
        }

        System.out.println("charArr : ");

        for (int i = 0; i < charArr.length; ++i){
            System.out.println(charArr[i]);
        }

        System.out.println("doublesArr : ");
        for (int i = 0; i < doublesArr.length; ++i){
            System.out.println(doublesArr[i]);
        }

        System.out.println("intArr : ");
        for (int i = 0; i < intArr.length; ++i){
            System.out.println(intArr[i]);
        }

        System.out.println("-------------------------------------------------");

        for (int temp: intArr){
            System.out.println(temp);
        }

        System.out.println("-------------------------------------------------");

        int [][] arr2int = new int[10][20];
        for (int i = 0; i < arr2int.length; ++i){
            for (int j = 0; j < arr2int[i].length; ++j){
                arr2int[i][j] = i+j;
            }
        }
        for (int i = 0; i < arr2int.length; ++i){
            for (int j = 0; j < arr2int[i].length; ++j){
                System.out.print(arr2int[i][j]);
            }
            System.out.println();
        }


        //System.out.println(Arrays.toString(arr2int));

        //System.out.println(Arrays.toString(intArr));

    }

}
