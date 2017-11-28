package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.util.convertors.PrimitiveConverter;

public class Lesson4Runner {
    public static void main(String[] args) {
        PrimitiveConverter converter = new PrimitiveConverter();

        //test charToInt()
        System.out.print("Method charToInt() test:");

        if (
                        converter.charToInt('9') == 57 &&
                        converter.charToInt('U') == 85 &&
                        converter.charToInt('u') == 117)
            System.out.println(" PASS.");

        else
            System.out.println(" FAIL");

        // test intToChar()
        System.out.print("Method intToChar() test:");

        if (

                        converter.intToChar(57) == '9' &&
                        converter.intToChar(85) == 'U' &&
                        converter.intToChar(117) == 'u')
            System.out.println(" PASS.");

        else
            System.out.println(" FAIL");

        // test floatToChar
        System.out.print("Method floatToChar() test:");

        if (
                        converter.floatToChar(57.23423324f) == '9' &&
                        converter.floatToChar(85.452354f) == 'U' &&
                        converter.floatToChar(0.00f) == 0)
            System.out.println(" PASS.");

        else
            System.out.println(" FAIL.");









    }
}
