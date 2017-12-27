package center.kit.app.homework.lesson10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class FilePractice {

    public static int[][] createAndFillArray(int numOfArrays, int sizeOfEachArray) {
        Random r = new Random();
        int[][] arr = new int[numOfArrays][sizeOfEachArray];
        for (int i = 0; i < numOfArrays; ++i) {
            for (int j = 0; j < sizeOfEachArray; ++j) {
                arr[i][j] = r.nextInt(99);
            }
        }
        return arr;
    }

    public static void saveToFile(int[][] arr, String path) {
        try (FileOutputStream fo = new FileOutputStream(path)) {
            for (int i = 0; i < arr.length; ++i) {
                for (int j = 0; j < arr[i].length; ++j) {
                    fo.write(arr[i][j]);
                }
            }
            fo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[][] readFromFileToArr(String path, int size1, int size2) {
        int[][] arr = new int[size1][size2];
        try (FileInputStream fi = new FileInputStream(path)) {
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 5; ++j) {
                    arr[i][j] = fi.read();
                }
            }
            fi.close();
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 5; ++j) {
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

    public static int[][] sortArr(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length - 1; ++j) {
                if (arr[i][j] < arr[i][j + 1]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][j + 1];
                    arr[i][j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void showArr(int arr[][]) {
        System.out.println("showArr");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createAndFillFilebyWords(String path) {
        try (FileOutputStream fo = new FileOutputStream(path)) {
            fo.write(Byte.valueOf("moom"));
            fo.write(Byte.valueOf("mooom"));
            fo.write(Byte.valueOf("worow"));
            fo.write(Byte.valueOf("1111"));
            fo.write(Byte.valueOf("word1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getNameOfFile(){
        System.out.println("Please enter name of file");
        String filename = "";
        boolean isReady = false;
        Scanner sc = new Scanner(System.in);
        while(!isReady) {
            try {
                filename = sc.next();
                if (filename.contains(" ")) {
                    System.out.println("Enter correct name of file: ");

                } else {
                    isReady = true;
                }
            }catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        }
        sc.close();
        return filename;
    }

    public static String safelyGetString(){
        boolean isReady = false;
        Scanner sc = new Scanner(System.in);
        String stringToSave = "";
        while(sc.hasNext()) {
            try {

                    stringToSave = sc.next();
                    isReady = true;

                    //System.out.println("Lets try again...");

            }catch (Exception e){
                System.out.println("Enter correct data: ");
                System.out.println(e.getStackTrace());
            }
        }
        sc.close();
        return stringToSave;
    }

}
