package center.kit.runners.homework.lesson7_1;

import center.kit.app.homework.lesson7_1.ArrayPractice;

public class ArrayPracticeRunner {
    public static void main(String[] args) {
        ArrayPractice.createAndShowPairArray(new int[10], 10);
        ArrayPractice.createAndReverseArray1(new int[50], 50);
        ArrayPractice.showRandomArrayEvenNumbers(new int[15], 15);
        ArrayPractice.showMaxMinValueFromArray(new int[15], 15);
        ArrayPractice.createMatrix(new int[8][5], 8, 5);
        ArrayPractice.rightAlignOutput(new int[8][5], 8, 5);

        ArrayPractice.automaticCountNumbersFromInput();
    }
}
