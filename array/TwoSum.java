package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 1, 6, 2, 10, 3 };
        int target = 7;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < result.length; i++) {
            int num = nums[i];
            int required = target - num;
            if (map.containsKey(required)) {
                result[0] = i;
                result[1] = map.get(required);
                break;
            } else {
                map.put(num, i);
            }
        }
        return result;
    }

}
