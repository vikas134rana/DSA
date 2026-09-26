package array;

public class IsArraySorted {

    public static void main(String[] args) {
        IsArraySorted obj = new IsArraySorted();
        int[] arr = { 1, 2, 2, 3, 4, 5 };
        boolean sorted = obj.isArraySorted(arr);
        System.out.println("sorted: " + sorted);
    }

    private boolean isArraySorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
