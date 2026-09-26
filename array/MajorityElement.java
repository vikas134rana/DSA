package array;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = { 2,2,1,1,1,2,2 };
        int majorityElement = new MajorityElement().majorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int element = nums[0];

        for (int num : nums) {
            if(count==0)
                element = num;
            
            if(element == num)
                count++;
            else
                count--;

        }

        return element;
    }

}
