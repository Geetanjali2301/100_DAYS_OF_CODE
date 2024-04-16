import java.util.*;

/*
# Leetcode 228
*/

public class summaryRanges {

    public static List<String> summaryRanges(int[] nums) {

        int i=0;
        int j=0;
        int n=nums.length;
        List<String> ans=new ArrayList<>();

        while(j<n)
        {
            if(j+1<n && nums[j]+1==nums[j+1])
            {
                j++;
            }
            else
            {
                String temp="";
                if(i!=j)
                {
                    temp=nums[i]+"->"+nums[j];
                }
                else
                {
                    temp=String.valueOf(nums[i]);
                }
                ans.add(temp);
                j++;
                i=j;
            }
        }

        return ans;
        
    }

    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,7};
        List<String> ans=summaryRanges(nums);
        System.out.println(ans);
    }
    
}
