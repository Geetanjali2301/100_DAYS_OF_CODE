package DAY_52;
/*
# Leetcode 15
*/

import java.util.*;
public class sum3 {

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]==0)
                {
                    
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]>0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
           
        }

        return new ArrayList<>(ans);
        
    }

    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=threeSum(nums);
        System.out.println(ans);
    }
    
}
