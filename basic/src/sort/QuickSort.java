package sort;

import java.util.Arrays;

/**
 * 快速排序
 * @author Amoboo
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = new int[]{12, 35, 21, 87, 2, 8, 10, 23, 21, 9};
        System.out.println(">>>primitiveArray-"+ Arrays.toString(nums));
        quickSort2(nums,0,9);
        System.out.println(">>>afterSortArray-" + Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int left, int right){
        if (left >= right) {
            return;
        }
        int nextPointer = left +1;
        int rightPointer = right;
        while (nextPointer <= rightPointer){
            if(nums[nextPointer] > nums[left]){
                swap(nums, nextPointer, rightPointer);
                rightPointer--;
            }else {
                nextPointer++;
            }
        }
        nextPointer--;
        swap(nums, left, nextPointer);
        quickSort(nums, left, nextPointer - 1);
        quickSort(nums,nextPointer+1, right);
    }

    public static void quickSort2(int[] nums, int left, int right){
        if (left >= right) {
            return;
        }
        int nextPointer = left + 1;
        int basicPointer = left;
        while (nextPointer <= right){
            if(nums[nextPointer] <= nums[left]){
                swap(nums, basicPointer + 1, nextPointer);
                basicPointer++;
            }
            nextPointer++;
        }
        swap(nums, left, basicPointer);
        quickSort(nums, left, basicPointer - 1);
        quickSort(nums,basicPointer+1, right);
    }

    public static void swap(int[] nums, int index, int nextIndex){
        if (index != nextIndex) {
            int temp = nums[index];
            nums[index] = nums[nextIndex];
            nums[nextIndex] = temp;
        }
    }
}
