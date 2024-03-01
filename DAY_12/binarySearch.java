package DAY_12;
/*
# Leetcode 704
*/

public class binarySearch {

    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int arr[]={0,3,5,6,9,12};
        int idx=search(arr, 9);
        System.out.println(idx);
    }


    
}
