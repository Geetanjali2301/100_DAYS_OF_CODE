package DAY_37;
/*
# Leetcode 78
*/

import java.util.ArrayList;
import java.util.List;

public class subset {

    public static void subsethelper(List<Integer> ans,List<List<Integer>> sublist,int i,int[] nums)
    {
        //base case
        if(i==nums.length)
        {
            sublist.add(new ArrayList<>(ans));
            return;
        }

         //take 
        int element=nums[i];
        ans.add(element);
        subsethelper(ans,sublist,i+1,nums);

        ans.remove(ans.size()-1);

        //not take
        subsethelper(ans,sublist,i+1,nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> sublist=new ArrayList<>();
        int i=0;
        
        subsethelper(ans,sublist,i,nums);
        return sublist;     
    }

    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> ans=subsets(nums);
        System.out.println(ans);

    }

    
}
