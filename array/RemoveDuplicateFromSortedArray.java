package array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        var obj = new RemoveDuplicateFromSortedArray();
        int[] arr = {0, 0, 0, 3, 3, 5, 6};
        //                 l           i
       int len = obj.removeDuplicateFromSortedArray(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, len)));
    }

    private int removeDuplicateFromSortedArray(int[] arr) {
        if(arr.length == 1)
            return 1;

        int l=0;
        for (int i = 1; i < arr.length; i++) {
            
            
            if(arr[l] != arr[i]){
                arr[++l] = arr[i];
            } else { // equal
                continue;
            }
            
        }
        return l+1;

    }

}
