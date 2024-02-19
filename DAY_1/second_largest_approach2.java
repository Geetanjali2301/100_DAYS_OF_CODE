package DAY_1;
import java.util.*;

/*
This is the O(nlogn) approach for finding second largest element in the array.
*/

public class second_largest_approach2 {

    public static void main(String[] args) {
        int arr[]={1,34,56,7,8,99,45};
        Arrays.sort(arr);
        System.out.println("The second largest element in the array is: "+arr[arr.length-2]);
    }
    
}
