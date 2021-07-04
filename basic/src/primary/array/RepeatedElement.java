package primary.array;

import java.util.*;

/**
 * 重复元素
 */
public class RepeatedElement {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 5, 8, 3, 9, 3};
        System.out.println(containsDuplicateB(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> arraySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!arraySet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateA(int[] nums) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int currentValue=nums[i];
            if(numberList.contains(currentValue)){
                return true;
            }
            numberList.add(currentValue);
        }
        return false;
    }

    public static boolean containsDuplicateB(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


}
