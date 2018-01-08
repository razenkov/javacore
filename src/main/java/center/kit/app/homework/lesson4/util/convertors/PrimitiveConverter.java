package center.kit.app.homework.lesson4.util.convertors;

public class PrimitiveConverter {

    public char floatToChar(float floatData) {
        char returnValue = (char)floatData;
        System.out.println("Input float value is " + floatData + ". Output char value is " + returnValue);
        return returnValue;
    }

    public char intToChar(int intData) {
        char returnValue = (char)intData;
        System.out.println("Input int value is " + intData + ". Output char value is " + returnValue);
        return returnValue;
    }

    public int charToInt(char charData) {
        int returnValue = (int)charData;
        System.out.println("Input char value is " + charData + ". Output int value is " + returnValue);
        return returnValue;
    }

}
