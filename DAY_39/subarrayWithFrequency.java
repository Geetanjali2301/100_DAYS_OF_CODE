package DAY_39;
/*
# Leetcode 2958
*/

import java.util.HashMap;

public class subarrayWithFrequency {

    public static int maxSubarrayLength(int[] nums, int k) {
       int ans=0;
       int i=0;
       int j=0;

       HashMap<Integer,Integer> h=new HashMap<>();

       while(j<nums.length)
       {
        if(!h.containsKey(nums[j]))
        {
            h.put(nums[j],1);
        }
        else
        {
            h.put(nums[j],h.get(nums[j])+1);
        }

        while(i<=j && h.get(nums[j])>k)
        {
            h.put(nums[i],h.get(nums[i])-1);
            i++;

        }

        ans=Math.max(ans,j-i+1);
        j++;
       }

       return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,1,2,3,1,2};
        int ans=maxSubarrayLength(nums, 2);
        System.out.println(ans);
    }
    
}
