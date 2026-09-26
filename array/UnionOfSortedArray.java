package array;

import java.util.Arrays;

public class UnionOfSortedArray {

    public static void main(String[] args) {
        int[] nums1 = { 3, 4, 6, 7, 9, 9 }, nums2 = { 1, 5, 7, 8, 8 };
        var unionArray = new UnionOfSortedArray().unionArray(nums1, nums2);
        System.out.println(Arrays.toString(unionArray));
    }

    public int[] unionArray(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        int i1 = 0, i2 = 0, i3 = 0;

        // compare both array and put min in result
        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] < nums2[i2]) {
                if (i3 == 0 || result[i3 - 1] != nums1[i1]) {
                    result[i3++] = nums1[i1];
                }
                i1++;
            } else if (nums1[i1] > nums2[i2]) {
                if (i3 == 0 || result[i3 - 1] != nums2[i2]) {
                    result[i3++] = nums2[i2];
                }
                i2++;
            } else {
                if (i3 == 0 || result[i3 - 1] != nums1[i1]) {
                    result[i3++] = nums1[i1];
                }
                i1++;
                i2++;
            }
        }

        // remaining array should be put in result directly
        while (i1 < nums1.length) {
            if (i3 == 0 || result[i3 - 1] != nums1[i1])
                result[i3++] = nums1[i1];
            i1++;
        }
        while (i2 < nums2.length) {
            if (i3 == 0 || result[i3 - 1] != nums2[i2])
                result[i3++] = nums2[i2];
            i2++;
        }

        return Arrays.copyOf(result, i3);
    }

}
