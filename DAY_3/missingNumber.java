package DAY_3;
/*
# Leetcode 268
*/

import java.util.Arrays;

public class missingNumber {

    public static int missing_Number(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int nsum=(n*(n+1))/2; 
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            temp=temp+nums[i];
        }
        return nsum-temp;         
    }

    public static void main(String[] args) {
        int nums[]={1,0,3};
        System.out.println("The missing number is: "+missing_Number(nums));
        
    }
    
}
