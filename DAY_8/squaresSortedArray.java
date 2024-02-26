package DAY_8;

import java.util.Arrays;

/*
# Leetcode 977 
*/

public class squaresSortedArray {

    public static int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int arr[]={4,-1,10,-9,6};
        int[] ans=sortedSquares(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }



    
}
