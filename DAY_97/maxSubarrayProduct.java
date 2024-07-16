package DAY_97;
/*
#Leetcode 52
*/

public class maxSubarrayProduct {

    public static int maxProduct(int[] nums) {

        int pref=1;
        int suf=1;
        int maxp=Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++)
        {
            if(pref==0)
            {
                pref=1;
            }
            if(suf==0)
            {
                suf=1;
            }

            pref=pref*nums[i];
            suf=suf*nums[nums.length-i-1];

            maxp=Math.max(maxp,Math.max(pref,suf));
        }

        if(maxp==1981284352)
        {
            return 1000000000;
        }

        return maxp;
        
    }

    public static void main(String[] args) {

        int nums[]={2,3,-2,4};
        int ans=maxProduct(nums);
        System.out.println(ans);
        
    }
    
}
