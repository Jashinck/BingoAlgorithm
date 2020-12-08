package primary.array;

import java.util.Arrays;

public class RepeatedArray {

    public static void main(String[] args) {
        int[] testNums = new int[]{1, 1, 1, 2, 3, 3, 5, 5, 5, 6, 6, 7};
        System.out.println("start testNums: " + Arrays.toString(testNums));
        int resultLength = removeDuplicated(testNums);
        System.out.println("resultLength:" + resultLength);
        int[] targetNums = new int[resultLength];
        System.arraycopy(testNums, 0, targetNums, 0, resultLength);
        System.out.println("after testNums: " + Arrays.toString(targetNums));
    }

    public static int removeDuplicated(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int currentPointer = 0;
        for (int nextPointer = 1; nextPointer < nums.length; nextPointer++) {
            if (nums[currentPointer] == nums[nextPointer]) {
                continue;
            }
            currentPointer++;
            nums[currentPointer] = nums[nextPointer];
        }
        return currentPointer + 1;
    }
}
