package array;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 2};
        // d j
        new NextPermutation().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        // Step 1: Find the largest index i such that nums[i] < nums[i + 1]
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such an index exists, find the largest index j > i such that nums[j] > nums[i]
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the elements from i + 1 to the end
        reverse(nums, i + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
