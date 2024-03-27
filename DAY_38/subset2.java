package DAY_38;
/*
# Leetcode 90
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {

    public static void subsethelper(List<Integer> ans,List<List<Integer>> sublist,int i,int[] nums)
    {
        //base case
       
            if(sublist.contains(ans))
            {
                return;
            }
            sublist.add(new ArrayList<>(ans));
            

         //take 
        for(int start=i;start<nums.length;start++)
        {
            //take
            ans.add(nums[start]);

            //backtrack
            subsethelper(ans,sublist,start+1,nums);
        
            
            //not take
            ans.remove(ans.size()-1);
        }
       
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) { 
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> sublist=new ArrayList<>();
        int i=0;
        Arrays.sort(nums);
        subsethelper(ans,sublist,i,nums);
        return sublist;    
        
    }

    public static void main(String[] args) {
        int nums[]={1,2,2};
        List<List<Integer>> ans=subsetsWithDup(nums);
        System.out.println(ans);
    }


    
}
