package DAY_38;
/*
# Leetcode 198
*/

public class robberHouse {

    public static int rob(int[] nums) {

        if(nums.length<2)
        {
            return nums[0];
        }

        int helper[]=new int[nums.length];

        helper[0]=nums[0];
        helper[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++)
        {
            helper[i]=Math.max((helper[i-2]+nums[i]),helper[i-1]);
        }

        return helper[nums.length-1];
        
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int ans=rob(nums);
        System.out.println(ans);
    }
    
}
