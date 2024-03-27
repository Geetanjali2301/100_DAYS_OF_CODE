package DAY_38;
/*
# Leetcode 713
*/

public class subarrayProduct {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int product = 1;
        int left = 0;

        for(int right = 0;right<nums.length;right++){
            product *= nums[right];

            while(product >= k && left <= right){
                product /= nums[left];
                left++;
            }
            
            ans += right - left + 1;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        int nums[]={10,5,6,9};
        int ans=numSubarrayProductLessThanK(nums, 100);
        System.out.println(ans);
    }
    
}
