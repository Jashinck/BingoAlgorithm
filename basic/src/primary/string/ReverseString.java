package primary.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] temptArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("beforeReverse: " + Arrays.toString(temptArray));
        reverseString(temptArray);
        System.out.println("afterReverse: " + Arrays.toString(temptArray));
    }

    public static void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int length = s.length;
        for (int index = 0; index < length / 2; index++) {
            char tempt = s[index];
            int backIndex = length - index - 1;
            s[index] = s[backIndex];
            s[backIndex] = tempt;
        }
    }

}
