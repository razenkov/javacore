package center.kit.app.homework.lesson8;
//Schoology_lesson8
public class StringPractice {
    public static void isPalindrome1(String s) {
        boolean isPalindrome = true;
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        //Running loop from both sides
        for (int i = 0; i < arr.length / 2; ++i) {
            if (arr[i] != arr[arr.length - i - 1]) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("isPalindrome");
        } else {
            System.out.println("NotPalindrome");
        }
    }

    public static void isPalindrome2(String s) {
        s = s.toLowerCase();
        int sizeOfHalfArrays;
        char[] arr = s.toCharArray();
        if (arr.length % 2 == 0) {
            sizeOfHalfArrays = arr.length / 2;
        } else {
            sizeOfHalfArrays = arr.length / 2 + 1;
        }
        //Creating two char[] arrays for equalsIgnoreCase check in the end
        char[] first = new char[sizeOfHalfArrays];
        char[] second = new char[sizeOfHalfArrays];
        int count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; ++i) {
            //To add the middle letter to both arrays like 'le V el' [leV],[Vel]
            //if array contains unpaired quantity of letters
            if (i == sizeOfHalfArrays - 1 && arr.length % 2 == 1) {
                second[count2] = arr[i];
                count2++;
            }
            if (i < sizeOfHalfArrays) {
                first[count1] = arr[i];
                count1++;
            } else {
                second[count2] = arr[i];
                count2++;
            }
        }
        //Reversing one of arrays
        for (int i = 0; i < second.length / 2; ++i) {
            char temp = second[i];
            second[i] = second[second.length - i - 1];
            second[second.length - i - 1] = temp;
        }

        if (String.valueOf(first).equalsIgnoreCase(String.valueOf(second))) {
            System.out.println("isPalindrome");
        } else {
            System.out.println("NotPalindrome");
        }

    }

    public static void isPalindrome3(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        if (s.equalsIgnoreCase(s2)) {
            System.out.println("isPalindrome");
        } else {
            System.out.println("NotPalindrome");
        }
    }

    public static void isPalindrome4(String s) {
        int sizeOfSubstrings;
        String s1, s2;
        if (s.length() % 2 == 0) {
            sizeOfSubstrings = s.length() / 2;
            s2 = s.substring(sizeOfSubstrings, s.length());
        } else {
            sizeOfSubstrings = s.length() / 2 + 1;
            s2 = s.substring(sizeOfSubstrings - 1, s.length());
        }

        s1 = s.substring(0, sizeOfSubstrings);
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        String temp = "";
        for (int i = s2.length() - 1; i >= 0; --i) {
            temp = temp + s2.charAt(i);
        }
        s2 = temp;

        if (0 == s1.compareTo(s2)) {
            System.out.println("isPalindrome");
        } else {
            System.out.println("NotPalindrome");
        }
    }
}
