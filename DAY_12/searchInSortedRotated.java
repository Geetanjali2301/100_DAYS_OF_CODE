package DAY_12;
/*
# Leetcode 33
*/

public class searchInSortedRotated {

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

            if(nums[start]<=nums[mid])
            {
               if(target<=nums[mid] && target>=nums[start])
               {
                   end=mid-1;
               }
               else
               {
                   start=mid+1;
               }
            }
            else
            {
                if(target<=nums[end] && target>=nums[mid])
                {
                    start=mid+1;
                }
                else
               {
                   end=mid-1;
               } 
            }
        }
        return -1;

        
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int idx=search(arr, target);
        System.out.println(idx);
    }
    
}
