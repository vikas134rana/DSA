package array;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };
        SecondLargestElement obj = new SecondLargestElement();
        int secondMax = obj.secondLargestElement(arr);
        System.out.println("secondMax: " + secondMax);
    }

    public int secondLargestElement(int[] arr) {
        if (arr == null || arr.length <= 1)
            return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }

}