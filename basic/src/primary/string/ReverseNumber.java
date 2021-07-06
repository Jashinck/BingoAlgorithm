package primary.string;

/**
 * 整数反转
 * @author Amboo
 */
public class ReverseNumber {

    public static void main(String[] args){
        int number = -102;
        System.out.println(reverse(number));
    }

    public static int reverse(int x) {
        int absValue = x > 0 ? x : x * -1;
        int countLevel = 0;
        while (absValue > 0) {
            absValue /= 10;
            countLevel++;
        }

        absValue = x > 0 ? x : x * -1;
        int reverseValue = 0;
        for (int i = 0; i < countLevel; i++) {
            int currentValue = absValue % 10;
            reverseValue += currentValue * Math.pow(10, countLevel - i - 1);
            absValue /= 10;
        }
        if (x < 0) {
            return reverseValue * -1;
        }
        return reverseValue;
    }
}
