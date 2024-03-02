package DAY_13;
/*
# Leetcode 53
*/

public class maximumSubarray {

    public static int maxSubArray(int[] nums) {
     
        int j=0;
        int max=Integer.MIN_VALUE;
        int sum=0;

        while(j<nums.length)
        {
            
            if(sum>=0)
            {
                sum += nums[j];
            }
            else
            {
                sum=nums[j];
            }
            max=Math.max(max,sum);
            j++;
        }
       return max; 
    }

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int ans=maxSubArray(arr);
        System.out.println(ans);
    }
    
}
