package DAY_40;
/*
# Leetcode 2962
*/

public class subarrayMaxFreq {

    public static long countSubarrays(int[] nums, int k) 
    {
        
            int max=0;
            for(int p=0;p<nums.length;p++)
            {
                if(nums[p]>max)
                {
                    max=nums[p];
                }
            }
     
            int n=nums.length;
            int start=0;
            int end=0;
            long count=0;
            int maxef=0;
            while(end<n){
                if(nums[end]==max){
                    maxef++;
                }
                while( maxef==k){
                    count=count+n-end;
                    if(nums[start]==max){
                        maxef--;
                    }
                    start++;
                }
                end++;
            }
            return count;
     
    }

    public static void main(String[] args) {
        int nums[]={1,3,2,3,3};
        int k=2;
        long ans=countSubarrays(nums, k);
        System.out.println(ans);
    }
    
}
