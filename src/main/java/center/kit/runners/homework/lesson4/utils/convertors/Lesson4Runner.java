package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.util.convertors.PrimitiveConvertor;

public class Lesson4Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();

        float testFloat = 120.456f;
        System.out.println("Float "+ testFloat +" casted to char: " + convertor.floatToChar(testFloat));

        int testInt = 21474;
        System.out.println("Int " + testInt + " casted to char: " + convertor.intToChar(testInt));

        char testChar = 'X';
        System.out.println("Char " + testChar + " casted to int: " + convertor.charToInt(testChar));

    }
}
