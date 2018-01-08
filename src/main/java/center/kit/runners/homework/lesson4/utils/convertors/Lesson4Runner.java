package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.util.convertors.PrimitiveConverter;

public class Lesson4Runner {
    public static void main(String[] args) {
        PrimitiveConverter converter = new PrimitiveConverter();

        converter.floatToChar(57.23423324f);
        converter.floatToChar(85.452354f);
        converter.floatToChar(0.00f);

        converter.intToChar(57);
        converter.intToChar(85);
        converter.intToChar(117);

        converter.charToInt('9');
        converter.charToInt('U');
        converter.charToInt('u');
    }
}
