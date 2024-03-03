package DAY_14;
/*
# Leetcode 2089
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetIndex {

    public static List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays .sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans.add(i);
            }
        }

        return ans;
        
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,5,2,6,7};
        int target=2;
        List<Integer> ans=targetIndices(arr, target);
        System.out.println(ans);
    }


    
}
