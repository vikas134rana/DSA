package array;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int[] nums1 = { -5, -2, 4, 5, 0, 0, 0 }, nums2 = { -3, 1, 8 };
        // i j

        new MergeTwoSortedArraysWithoutExtraSpace().merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1;
        int c = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[c] = nums2[j];

                j--;
            } else {
                nums1[c] = nums1[i];
                i--;
            }
            c--;
        }

        while(j>=0){
            nums1[c--] = nums2[j--];
        }

    }

}
