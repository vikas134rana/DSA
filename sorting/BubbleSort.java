package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = { 7, 4, 1, 5, 3 };

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public int[] bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;

    }

}
