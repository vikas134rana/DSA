package array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 1, 2 };
        List<Integer> leaders = new LeadersInArray().leaders(nums);
        System.out.println(leaders);
    }

    public List<Integer> leaders(int[] nums) {

        // put last element in result(leaders List) as it will be always a leader
        List<Integer> result = new ArrayList<>();
        result.add(nums[nums.length - 1]);

        // iterate from right to left and compare last leader
        // if the current value is greated than last leadder
        // then it will be put as new leader to the left of previous leader
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > result.get(0)) {
                result.addFirst(nums[i]);
            }
        }

        return result;
    }

}
