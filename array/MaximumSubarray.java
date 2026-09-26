package array;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // . i
        int maxSubArray = new MaximumSubarray().maxSubArray(arr);
        System.out.println(maxSubArray);
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = Integer.max(max, sum);
            sum = Integer.max(sum, 0);

        }
        return max;
    }
}
