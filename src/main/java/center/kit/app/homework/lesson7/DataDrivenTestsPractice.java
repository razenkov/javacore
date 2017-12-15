package center.kit.app.homework.lesson7;

public class DataDrivenTestsPractice {
    public static boolean isSameString(String s1, String s2) {
        if (s1.compareTo(s2) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isSameStringIgnoreCase(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    public static int returnIndexOfChar(String s, char ch) {
        return s.indexOf(ch);
    }

    public static int returnIndexOfCharAfterIndex(String s, char ch, int index) {
        return s.indexOf(ch, index);
    }

    public static boolean isYourStringEmpty(String s) {
        return s.isEmpty();
    }

    public static int lastIndexOfChar(String s, char ch) {
        return s.lastIndexOf(ch);
    }

    public static String concatStrings(String s, String s2) {
        return s.concat(s2);
    }

    public static int countNumberOfChar(String s, char ch) {
        int charCounter = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == ch) {
                charCounter++;
            }
        }
        return charCounter;
    }

    public static boolean isStringContainChar(String s, char ch) {
        boolean flag = false;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == ch) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static int trimSpaces(String s) {
        s.trim();
        return s.length();
    }
}
