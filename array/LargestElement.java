package array;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = { 3, 3, 0, 99, -40 };
        LargestElement obj = new LargestElement();
        int max = obj.largestElement(arr);
        System.out.println("max: " + max);
    }

    public int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}