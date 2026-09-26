package array;

import java.util.Arrays;

public class SortArrayWithZeroOneTwo {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 1, 0 };
        //           { 0, 0, 1, 1, 2 };
        //                   l  h
        //                         m
        // 0 to l-1, l to m-1, m to h and h+1 to n-1
        new SortArrayWithZeroOneTwo().sortZeroOneTwo(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sortZeroOneTwo(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;

        while (m <= h) {

            if (nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            }

            else if (nums[m] == 1) {
                m++;

            } else {
                swap(nums, m, h);
                h--;
            }

        }

    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }

}
