package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementTwo {

    public static void main(String[] args) {
        int[] arr = { -1, -1, -2, -2 };
        List<Integer> majorityElementTwo = new MajorityElementTwo().majorityElementTwo(arr);
        System.out.println(majorityElementTwo);
    }

    public List<Integer> majorityElementTwo(int[] nums) {
        Integer ele1 = null, ele2 = null;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (ele1 != null && num == ele1)
                count1++;
            else if (ele2 != null && num == ele2)
                count2++;
            else if (count1 == 0) {
                ele1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                ele2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;

        for (Integer cand : Arrays.asList(ele1, ele2)) {
            if (cand != null) {
                int count = 0;
                for (int num : nums)
                    if (num == cand)
                        count++;
                if (count > threshold)
                    result.add(cand);
            }
        }

        return result;
    }

}
