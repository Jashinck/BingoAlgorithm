package math;

import java.util.ArrayList;
import java.util.List;

/**
 * 3的倍数
 * 5的倍数
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int n = 10;
        List<String> fizzBuzz = fizzBuzz(n);
        System.out.println(fizzBuzz);
//        String hello = "Hello";
//        String dog = "dog";
//        System.out.println(hello.indexOf(dog));
    }

    private static List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();
        int i = 0;
        while (i++ < n) {
            String currentFizzBuzz = String.valueOf(i);
            if (i % 15 == 0) {
                currentFizzBuzz = "FizzBuzz";
            } else if (i % 3 == 0) {
                currentFizzBuzz = "Fizz";
            } else if (i % 5 == 0) {
                currentFizzBuzz = "Buzz";
            }
            fizzBuzz.add(currentFizzBuzz);
        }
        return fizzBuzz;
    }
}
