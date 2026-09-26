package array;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        new MoveZerosToEnd().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {

        // find first zero
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return;

        for (int i = j+1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            } 
        }

    }

}
