package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] nums = { 7, 4, 1, 5, 3 };
                  // { 4, 7, 1, 5, 3 };

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public int[] insertionSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int j = i;
            int key = nums[j];            

            while(j>0 && nums[j-1] > key){
                nums[j] = nums[j-1];
                j--;
            }

            nums[j] = key;

        }

        return nums;

    }

}
