package DAY_8;

/*
# Leetcode 167
*/

public class twoSumII {

    public static int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        
        while (nums[l] + nums[r] != target) 
        {
            if (nums[l] + nums[r] < target) 
            l++;
            else r--;
        }
    
        return new int[] {l+1, r+1};
        }

        public static void main(String[] args) {
            
            int arr[]={2,7,11,15};
            int[] ans=twoSum(arr, 9);
            System.out.println("["+ans[0]+","+ans[1]+"]");

        }
    
}
