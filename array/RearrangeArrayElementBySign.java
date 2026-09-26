package array;

import java.util.Arrays;

public class RearrangeArrayElementBySign {

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] result = new RearrangeArrayElementBySign().rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] rearrangeArray(int[] nums) {

        int[] result = new int[nums.length];

        int x = 0, y = 1;

        for (int num : nums) {
            if (num > 0) {
                result[x] = num;
                x = x + 2;
            } else {
                result[y] = num;
                y = y + 2;
            }
        }
        return result;
    }

}
