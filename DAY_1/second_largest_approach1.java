package DAY_1;
import java.util.*;

/*
This is the O(n) approach to find second largest element.
*/

public class second_largest_approach1 {
    public static void main(String[] args) {
        int arr[]={1,34,27,90,78,56};


        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }

        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>sec_max && arr[i]<max)
            {
                sec_max=arr[i];
            }
        }

        System.out.println("The second largest element in the array is: "+sec_max);
    }
    
}
