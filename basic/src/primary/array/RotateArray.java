package primary.array;

import java.util.Arrays;

/**
 * 旋转数组
 * @author Amboo
 */
public class RotateArray {

    public static void main(String[] args){
        int nums[] = new int[]{1, 2, 3, 4,6,8};
        int k = 2;
        System.out.println("premArray-" + Arrays.toString(nums));
        rotate_Round(nums, k);
        System.out.println("rotateArray-" + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int length = nums.length;
            int firstNum = nums[length-1];
            for (int j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = firstNum;
        }
    }

    public static void rotate_advance(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            reverse(nums, i, 1, k);
        }
        if(nums.length % k == 0){
            return;
        }
        if (nums.length % 2 == 0) {
            for (int j = k - 1; j > 0; j--) {
                int tempValue = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = tempValue;
            }
        } else {
            for (int j = 0; j < k - 1; j++) {
                int tempValue = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = tempValue;
            }
        }

    }

    public static void reverse(int[] nums, int index, int n, int k){
        int nextIndex = index + n * k;
        if(nextIndex < nums.length){
            int tempValue = nums[index];
            nums[index] = nums[nextIndex];
            nums[nextIndex] = tempValue;
            reverse(nums, index, ++n, k);
        }
    }

    public static void rotate_NewArray(int[] nums, int k) {
        int n = nums.length;
        int[] newArray = new int[n];
        for (int i = 0; i < n; ++i) {
            newArray[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArray, 0, nums, 0, n);
    }

    public static void rotate_Round(int[] nums, int k) {
        int hold = nums[0];
        int index = 0;
        int length = nums.length;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            index = (index + k) % length;
            if (visited[index]) {
                index = (index + 1) % length;
                hold = nums[index];
                i--;
            } else {
                visited[index] = true;
                int temp = nums[index];
                nums[index] = hold;
                hold = temp;
            }
        }
    }

}
