package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = { 7, 4, 1, 5, 3 };

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

     public int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]<min){
                    min = nums[j];
                    minIndex = j;
                }
                System.out.println(i +","+j+" : "+min);
            }
            int temp = nums[i];
            nums[i] = min;
            nums[minIndex] = temp;

        }

        return nums;

    }
}
