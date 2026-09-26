package array;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int maxOnes = new MaximumConsecutiveOnes().findMaxConsecutiveOnes(nums);
        System.out.println(maxOnes);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) { // match
                count++;
            } else { // compare count
                max = Integer.max(max, count);
                count = 0;
            }
        }

        return Integer.max(max, count);
    }

}
