package center.kit.app.classwork.lesson19;

public class UniversalSorter {
    public static <TYPE extends Comparable> TYPE[] sortNumbersMethod(TYPE[] arr) {
        TYPE[] arrayToSort = arr;
        TYPE temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if ((arr[j - 1].compareTo(arr[j])) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else if ((arr[j - 1].compareTo(arr[j])) < 0) {
                    //do nothing
                } else if ((arr[j - 1].compareTo(arr[j])) == 0) {
                    //do nothing
                }
            }
        }
        return arrayToSort;
    }
}
