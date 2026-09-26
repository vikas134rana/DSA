package array;

import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 3, 3, 3 }, nums2 = { 2, 3, 3, 4, 5, 7 };
        var intersectionArray = new IntersectionOfTwoSortedArrays().intersectionArray(nums1, nums2);
        System.out.println(Arrays.toString(intersectionArray));
    }

    public int[] intersectionArray(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[Integer.min(len1, len2)];

        int l = 0, r = 0, c = 0;
        while (l < len1 && r < len2) {
            if (nums1[l] < nums2[r]) {
                l++;
            } else if (nums1[l] > nums2[r]) {
                r++;
            } else {
                result[c++] = nums1[l];
                l++;
                r++;

            }
        }

        return Arrays.copyOf(result, c);
    }

}
