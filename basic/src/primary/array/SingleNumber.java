package primary.array;

import java.util.Arrays;

/**
 * 单个数据
 * @author Amboo
 */
public class SingleNumber {

    public static void main(String[] args){
        int[] nums = new int[]{2, 1, 2, 1, 3};
        System.out.println(singleNumberA(nums));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if(nums[i] != nums[i + 1]){
                    return nums[i];
                }
                continue;
            }
            if (i == nums.length - 1 ) {
                if(nums[i] != nums[i - 1]){
                    return nums[i];
                }
                continue;
            }
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static int singleNumberA(int[] nums) {
        int singleNumber = 0;
        for (int number : nums) {
            singleNumber ^= number;
        }
        return singleNumber;
    }

}
