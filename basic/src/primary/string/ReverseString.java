package primary.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] temptArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("beforeReverse: " + Arrays.toString(temptArray));
        reverseStringA(temptArray);
        System.out.println("afterReverse: " + Arrays.toString(temptArray));
    }

    public static void reverseString(char[] s) {
        int length = s.length;
        for (int index = 0; index < length / 2; index++) {
            char tempt = s[index];
            int backIndex = length - index - 1;
            s[index] = s[backIndex];
            s[backIndex] = tempt;
        }
    }

    public static void reverseStringA(char[] s) {
        int left = 0;
        int right = s.length -1;
        while (left < right){
            char tempt = s[left];
            s[left++] = s[right];
            s[right--] = tempt;
        }
    }

}
