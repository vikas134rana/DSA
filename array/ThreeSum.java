package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        // int[] nums = { 2, -2, 0, 3, -3, 5 };
        int[] nums = { 2, -1, -1, 3, -1 };
        List<List<Integer>> threeSum = new ThreeSum().threeSum(nums);
        System.out.println(threeSum);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // 1. Sort the array in ascending order:
        // - Enables the two-pointer technique (left moves right to increase sum, right
        // moves left to decrease sum).
        // - Groups identical values together, making duplicate skipping trivial.
        Arrays.sort(nums);

        // Loop through possible first elements of the triplet.
        // Stops at nums.length - 2 because we need at least two more elements (l and r)
        // to form a triplet.
        for (int i = 0; i < nums.length - 2; i++) {

            // DEDUPLICATION 1: Skip repeated elements for the first position.
            // If nums[i] == nums[i - 1], all valid triplets starting with this value were
            // already recorded
            // during the previous iteration.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // EARLY EXIT OPTIMIZATION:
            // Since the array is sorted, if the first element is strictly greater than 0,
            // all subsequent elements are also > 0. Three positive numbers can never sum to
            // 0.
            if (nums[i] > 0) {
                break;
            }

            // Initialize two pointers for the remaining subarray to the right of index i
            int l = i + 1; // Left pointer starts immediately after the fixed element
            int r = nums.length - 1; // Right pointer starts at the very end of the array
            int target = -nums[i]; // We need nums[l] + nums[r] == -nums[i] so that their total sum equals 0

            while (l < r) {
                int sum = nums[l] + nums[r];

                if (sum < target) {
                    // Sum is too small: shift left pointer right to access a larger number
                    l++;
                } else if (sum > target) {
                    // Sum is too large: shift right pointer left to access a smaller number
                    r--;
                } else {
                    // Found a valid triplet: nums[i] + nums[l] + nums[r] == 0
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Move both pointers inward to look for the next distinct pair
                    l++;
                    r--;

                    // DEDUPLICATION 2: Skip identical values for the second element.
                    // Advance 'l' as long as it points to the same value as the element just
                    // processed.
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // DEDUPLICATION 3: Skip identical values for the third element.
                    // Retreat 'r' as long as it points to the same value as the element just
                    // processed.
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }

        return result;
    }

}
