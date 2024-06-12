package DAY_85;
/*
#Leetcode 209
*/

public class minSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;
        int l=0;
        int sum=0;
        int min=n+1;

        for(int r=0;r<n;r++)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                min=Math.min(min,r-l+1);
                sum-=nums[l];
                l++;
            }

        }

        if(min==n+1)
        {
            return 0;
        }
        return min;
        
    }

    public static void main(String[] args) {
        int nums[]={2,3,1,2,4,3};
        int target=7;
        int ans=minSubArrayLen(target, nums);
        System.out.println(ans);
    }
    
}
