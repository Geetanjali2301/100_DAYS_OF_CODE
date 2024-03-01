package DAY_12;
/*
# Leetcode 34
# Approach 1(O(Log n))
*/

public class startEndIndex {

    public static int[] searchRange(int[] nums, int target) {

        int arr[]={-1,-1};
        arr[0]=findIndex(nums,target,true);
        arr[1]=findIndex(nums,target,false);

        return arr;
        
    }
    public static int findIndex(int nums[],int target,boolean startIndex )
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>target)
            {
                end=mid-1;  
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(startIndex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        int ans[]=searchRange(arr, target);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }

    
}
