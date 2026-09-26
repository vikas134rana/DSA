package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 2, 10, 3 };
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    void quickSort(int[] nums, int l, int r) {
        if (l >= r)
            return;

        int pivot = nums[r];
        int l1 = l, r1 = r - 1;

        while (l1 <= r1) {
            while (l1 <= r1 && nums[l1] <= pivot)
                l1++;
            while (l1 <= r1 && nums[r1] > pivot)
                r1--;

            if (l1 < r1) {
                int temp = nums[l1];
                nums[l1] = nums[r1];
                nums[r1] = temp;
                l1++;
                r1--;
            }
        }

        nums[r] = nums[l1];
        nums[l1] = pivot;

        quickSort(nums, l, l1 - 1);
        quickSort(nums, l1 + 1, r);
    }
}
