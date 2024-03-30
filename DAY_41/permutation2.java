package DAY_41;
/*
# Leetcode 47
*/

import java.util.ArrayList;
import java.util.List;

public class permutation2 {

     public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void helper(List<List<Integer>> ans,int i,int[] nums)
    {
        if(i==nums.length)
        {
            ArrayList<Integer> l=new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                l.add(nums[j]);
            }
            if(ans.contains(l))
            {
                return;
            }
            ans.add(new ArrayList(l));

        }
        for(int j=i;j<nums.length;j++)
        {
            swap(i,j,nums);
            helper(ans,i+1,nums);
            swap(i,j,nums);
        }

    }

    public static void main(String[] args) {
        int nums[]={1,1,2};
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,0,nums);
        System.out.println(ans);

    }
    
}
