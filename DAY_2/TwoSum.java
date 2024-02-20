package DAY_2;
import java.util.*;
/*
# Leetcode 1
*/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }

        return ans;
        
    }

    public static void main(String[] args) {
        int nums[]={2,6,1,9,0,5,8};
        int target=10;
        int ans[]=twoSum(nums,target);  
        System.out.println("["+ans[0]+","+ans[1]+"]");

    }
    
}
