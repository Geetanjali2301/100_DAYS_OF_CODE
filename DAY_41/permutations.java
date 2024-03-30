package DAY_41;
/*
# Leetcode 46
*/

import java.util.*;

public class permutations {

    public static void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static List<List<Integer>> permute(List<List<Integer>> ans,int i,int[] nums)
    {
        if(i==nums.length)
        {
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                l.add(nums[j]);
            }
            ans.add(new ArrayList<>(l));

        }

        for(int j=i;j<nums.length;j++)
        {
            swap(i,j,nums);
            //call for next idex recursively
            permute(ans, i+1, nums);
            //backtrack
            swap(i, j, nums);

        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> h=permute(ans,0,nums);
        System.out.println(ans);
    }
    
}
