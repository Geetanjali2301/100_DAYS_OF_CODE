package DAY_65;
/*
# Leetcode 2441
*/

import java.util.*;
public class largestPositive {

    public static int findMaxK(int[] nums) 
    {
        Arrays.sort(nums);//Sort the array
	    int Len = nums.length;//Length of array
	    for (int j = 0; j < Len; j++) 
        {
		   for (int k = Len - 1; k > 0; k--) 
            {
			   if (nums[j] + nums[k] == 0) {//nums of first +last element =0 
				   return nums[k];
			    }
		    }
	    }
	    return -1;
    }

    public static void main(String[] args) {
        int arr[]={-7,7,8,3,1};
        int ans=findMaxK(arr);
        System.out.println(ans);
    }
    
}
