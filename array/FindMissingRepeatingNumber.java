package array;

import java.util.Arrays;

public class FindMissingRepeatingNumber {

    public static void main(String[] args) {
        int[] nums = { 3, 5, 4, 1, 1 };
        // 1+2+3+4+5 = 15
        int[] result = new FindMissingRepeatingNumber().findMissingRepeatingNumbers(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = nums.length;

        // Sum of first n natural numbers: n*(n+1)/2
        long expected = n * (n + 1) / 2;
        // Sum of squares of first n natural numbers: n*(n+1)*(2n+1)/6
        long expected2 = n * (n + 1) * (2 * n + 1) / 6;

        long actual = 0;
        long actual2 = 0;

        for (int num : nums) {
            long val = num;
            actual += val;
            actual2 += val * val;
        }

        // e1 = Missing - Repeating
        long e1 = expected - actual;
        // e2 = Missing^2 - Repeating^2 = (Missing - Repeating) * (Missing + Repeating)
        long e2 = expected2 - actual2;

        // e3 = Missing + Repeating
        long e3 = e2 / e1;

        // Missing = (e1 + e3) / 2
        long missing = (e1 + e3) / 2;
        // Repeating = Missing - e1
        long repeating = missing - e1;

        // Standard output format: [repeating, missing]
        return new int[] { (int) repeating, (int) missing };
    }

}
