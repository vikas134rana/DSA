package array;

import java.util.Arrays;

//Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
// 0  1  2  3  4  5  6 
//Output: [5, 6, 7, 1, 2, 3, 4]
public class RightRotateArrayByK {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        new RightRotateArrayByK().rightRotateArrayByK(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    void rightRotateArrayByK(int[] arr, int k) {
        if (arr == null || arr.length <= 1)
            return;

        k = k % arr.length;
        int len = arr.length;

        reverse(arr, len-k, len-1);
        reverse(arr, 0, len-k-1);
        reverse(arr, 0, len-1);

    }

    // [1, 2, 3, 4]
    // [1, 2, 3]
    void reverse(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

}
