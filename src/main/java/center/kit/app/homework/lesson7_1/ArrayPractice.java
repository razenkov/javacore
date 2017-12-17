package center.kit.app.homework.lesson7_1;

        import java.util.Random;
        import java.util.Scanner;

public class ArrayPractice {
    /*Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива
     на экран сначала в строку, отделяя один элемент от другого пробелом,
     а затем в столбик (отделяя один элемент от другого началом новой строки).
     Перед созданием массива подумайте, какого он будет размера.
    2 4 6 … 18 20
    2
    4
    6
    …
    20*/
    public static void createAndShowPairArray(int arr[], int size) {
        int index = 0;
        for (int i = 1; i < size + 1; i++) {
            arr[index++] = i + i;
        }
        for (int temp : arr) {
            System.out.print(temp + ' ');
        }

        for (int temp : arr) {
            System.out.println(temp);
        }
    }

    /*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
     в строку, а затем этот же массив выведите на экран в другую строку,
     но в обратном порядке (99 97 95 93 … 7 5 3 1)*/
    public static void createAndReverseArray1(int arr[], int size) {
        for (int i = 1; i < size; ) {
            arr[i] = i;
            i += 2;
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr[size / 2]; ++i) {
            int temp = arr[1];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(i + " ");
        }
    }

    /*Создайте массив из 15 случайных целых чисел из отрезка [0;9].
    Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
    и выведете это количество на экран на отдельной строке.*/
    public static void showRandomArrayEvenNumbers(int arr[], int size) {
        Random r = new Random();
        int counter = 0;
        for (int i = 0; i < size; ++i) {

            arr[i] = r.nextInt(9);
            while (arr[i] < 0) {
                arr[i] = r.nextInt(9);
            }

            System.out.print(arr[i] + " ");

            if ((arr[i] % 2) == 0) {
                counter++;
            }
        }
        System.out.println("There are " + counter + "even numbers in the array");
    }

    /*Создайте массив из 15 случайных целых чисел из отрезка [0;999].
    Выведите массив на экран. Выведите минимальное и максимальное значение
    элементов массива*/
    public static void showMaxMinValueFromArray(int arr[], int size) {
        Random r = new Random();
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < size; ++i) {
            int temp = r.nextInt(999);
            while (temp < 0) {
                temp = r.nextInt(999);
            }
            arr[i] = temp;
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("MaxValue = " + maxValue);
        System.out.println("MinValue = " + minValue);
    }

    /*Создать двумерный массив из 8 строк по 5 столбцов в каждой из
    случайных целых чисел из отрезка [10;99]. Вывести массив на экран.*/
    public static void createMatrix(int arr[][], int size1, int size2) {
        Random r = new Random();
        for (int i = 0; i < size1; ++i) {
            for (int j = 0; j < size2; ++j) {
                int temp = r.nextInt(99);

                while (temp < 10) {
                    temp = r.nextInt(99);
                }
                arr[i][j] = temp;
            }
        }
        for (int i = 0; i < size1; ++i) {
            for (int j = 0; j < size2; ++j) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    /*Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных
    целых чисел из отрезка [1;999]. Вывести массив на экран в виде матрицы,
    где в каждом столбце числа должны быть выравнены по правому краю столбца*/
    public static void rightAlignOutput(int arr[][], int size1, int size2) {
        Random r = new Random();
        for (int i = 0; i < size1; ++i) {
            for (int j = 0; j < size2; ++j) {
                int temp = r.nextInt(999);

                while (temp < 1) {
                    temp = r.nextInt(999);
                }
                arr[i][j] = temp;
            }
        }
        for (int i = 0; i < size1; ++i) {
            for (int j = 0; j < size2; ++j) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    /*Запросить у пользователя ввести ряд чисел c вводом по одному
    через Enter (запрашиваем число - ввел число - Enter - запрашиваем следующее).
    Ввод должен прерываться словом “exit”, о чем нужно сообщить пользователю
    (если пользователь ввел “exit” - больше не запрашиваем числа).
    После прерывания ввода - вывести сумму всех введенных пользователем чисел.*/
    public static void automaticCountNumbersFromInput() {
        System.out.println("For automatic counting numbers you printing, please press 'Enter' after every number you want to add to the sum.");
        System.out.println("To get result print 'exit' and press enter.");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String UserExit;
        boolean isExit = false;

        while (!isExit) {
            int input;
            UserExit = sc.next();
            //To avoid exception while parsing
            try {
                //To check for 'exit' input from user
                if (!(UserExit.equals("exit"))) {
                    input = Integer.parseInt(UserExit);
                    sum += input;
                } else {
                    isExit = true;
                }
            } catch (Exception e) {
                System.out.println("Please enter correct value:");
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
