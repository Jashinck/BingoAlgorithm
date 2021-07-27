package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 判断质数
 */
public class IsPrime {

    public static void main(String[] args){

        Random random = new Random();
        int num = 10000;
        int count = 0;
        int numIndex = num;
        List<Integer> arrays = new ArrayList<>();
        while (numIndex > 1){
            if(isPrimeB(numIndex)&&numIndex<num){
                count++;
                arrays.add(numIndex);
            }
            numIndex--;
        }
        System.out.println("num=" + num + "-count=" +count);
//        System.out.println("arrays-" +arrays.toString());

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

    public static boolean isPrimeB(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
