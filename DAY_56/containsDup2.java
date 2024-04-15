package DAY_56;
/*
# Leetcode 219
*/

import java.util.*;
public class containsDup2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
         
            if(h.containsKey(nums[i]))
            {
                if(i-h.get(nums[i])<=k)
                {
                    return true;
                }
            }
            h.put(nums[i],i);
 
        }
 
        return false;
         
    }

    public static void main(String[] args) {
        int nums[]={1,0,1,1};
        int k=1;
        boolean ans=containsNearbyDuplicate(nums, k);
        System.out.println(ans);
    }
    
}
