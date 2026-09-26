package array;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        new LeftRotateArrayByOne().leftRotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    void leftRotateArrayByOne(int[] arr){
        if(arr == null || arr.length <=1)
            return; 

        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = first;

    }

}
