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
        int reverseValue = 0;
        while (x != 0) {
            int currentValue = x % 10;
            int currentReverse = reverseValue * 10 + currentValue;
            // 越位
            if ((currentReverse - currentValue) / 10 != reverseValue) {
                return 0;
            }
            reverseValue = currentReverse;
            x /= 10;
        }
        return reverseValue;
    }
}
