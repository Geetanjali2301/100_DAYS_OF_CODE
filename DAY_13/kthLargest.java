package DAY_13;
/*
# Leetcode 215
O(nlogn)
*/

import java.util.Arrays;

public class kthLargest {

    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];
        
    }

    public static void main(String[] args) {
        int arr[]={2,6,5,1,9,8,7};
        int k=2;
        int ans=findKthLargest(arr, k);
        System.out.println(ans);
    }
    
}
