package DAY_14;
/*
# Leetcode 2529
*/

public class maxCount {
    public static int maximumCount(int[] nums) {

        int countpos=0;
        int countneg=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                countneg++;
            }
            else if(nums[i]>0)
            {
                countpos++;
            }
        }
        return Math.max(countpos,countneg);
        
    }

    public static void main(String[] args) {
        int arr[]={-1,-2,6,0,0,1,2};
        int ans=maximumCount(arr);
        System.out.println(ans);
    }
    
}
