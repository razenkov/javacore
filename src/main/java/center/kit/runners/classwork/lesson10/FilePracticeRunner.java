package center.kit.runners.classwork.lesson10;

import center.kit.app.homework.lesson10.FilePractice;

public class FilePracticeRunner {
    public static void main(String[] args) {
        //Task 1
        //Реализовать чтение из файла строк с массивами чисел, разделенными запятыми,
        // и их сортировку с последующей записью в другой файл. Для чтения файла и записи в
        // файл создать вспомогательные классы и/или методы.

        String firstFilePath = "C:\\Users\\adm1n\\Desktop\\QaAutoCourse\\firstfile.txt";
        String secondFilePath = "C:\\Users\\adm1n\\Desktop\\QaAutoCourse\\secondfile.txt";
        //Sizes of arr[][]
        int size1 = 5;
        int size2 = 5;
        //Create and save the array to work with
        FilePractice.saveToFile(
                FilePractice.createAndFillArray(
                        size1, size2), firstFilePath);

        //Read created array from file
        int[][] arr = FilePractice.readFromFileToArr(
                firstFilePath, size1, size2);

        //Show it
        FilePractice.showArr(arr);

        //Sorting arr[][]
        arr = FilePractice.sortArr(arr);

        //Show it
        FilePractice.showArr(arr);

        //Save to second file
        FilePractice.saveToFile(arr, secondFilePath);

        //Read from second file
        arr = FilePractice.readFromFileToArr(secondFilePath, size1, size2);

        //Show it
        FilePractice.showArr(arr);
    }
}
