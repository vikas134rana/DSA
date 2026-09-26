package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] nums = { 7, 4, 1, 5, 3 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public int[] mergeSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        innerMergeSort(nums, 0, nums.length - 1);
        return nums;

    }

    public void innerMergeSort(int[] nums, int l, int r) {

        if (l >= r) { // base conditon
            return;
        }

        int mid = l + (r - l) / 2;

        innerMergeSort(nums, l, mid);
        innerMergeSort(nums, mid + 1, r);

        // merge from l, mid-1 to mid, r
        merge(nums, l, mid, r);

    }

    private void merge(int[] nums, int l, int mid, int r) {
        // 1. Allocate a temporary array for size (r - l + 1)
        int[] arr = new int[r - l + 1];
        int c = 0;

        // 2. Set pointer p1 = l (runs up to mid), pointer p2 = mid + 1 (runs up to r)
        int p1 = l, p2 = mid + 1;

        // 3. Compare nums[p1] and nums[p2], copying the smaller one into temp
        while (p1 <= mid && p2 <= r) {
            if (nums[p1] <= nums[p2]) {
                arr[c++] = nums[p1++];
            } else {
                arr[c++] = nums[p2++];
            }
        }

        // 4. Drain whichever side has remaining elements
        while (p1 <= mid) {
            arr[c++] = nums[p1++];
        }

        while (p2 <= r) {
            arr[c++] = nums[p2++];
        }

        // 5. Copy temp back into nums[l ... r]
        c = 0;
        while (l <= r) {
            nums[l++] = arr[c++];
        }

    }
}
