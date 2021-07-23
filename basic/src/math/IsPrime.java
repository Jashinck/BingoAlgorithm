package math;

import java.util.Random;

/**
 * 判断质数
 */
public class IsPrime {

    public static void main(String[] args){

        Random random = new Random();
        int num = random.nextInt(100);
        boolean isPrime = isPrime(num);
        System.out.println("num=" + num + "-isPrime=" + isPrime);
    }

    private static boolean isPrime(int n) {
        if (n <= 3) {
            return true;
        }
        // filter 2 or 3 multiple
        if (n % 6 != 1 && n % 6 != 5) {
            return false;
        }
        // filter 5,7,11 multiple
        int sqrNum = (int) Math.sqrt(n);
        for (int i = 5; i < sqrNum; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
