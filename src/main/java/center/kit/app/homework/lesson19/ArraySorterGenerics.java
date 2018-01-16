package center.kit.app.homework.lesson19;
import java.math.BigDecimal;

public class ArraySorterGenerics<TYPE extends Number> {

    private TYPE[] array;

    public ArraySorterGenerics(TYPE[] arr) {
        this.array = arr;
        sort();
    }

    public TYPE[] getArray() {
        return array;
    }

    private void sort() {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (((new BigDecimal(
                        array[j - 1].toString()).compareTo(
                        new BigDecimal(
                                array[j].toString()
                        ))) > 0)) {
                    TYPE temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static <TYPE extends Number> void sort(TYPE[] arr) {
        TYPE temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (((new BigDecimal(
                        arr[j - 1].toString()).compareTo(
                        new BigDecimal(
                                arr[j].toString()
                        ))) > 0)) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
