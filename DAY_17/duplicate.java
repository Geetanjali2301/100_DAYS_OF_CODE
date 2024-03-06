package DAY_17;
/*
# Leetcode 287
*/

public class duplicate {

    public static int findDuplicate(int[] nums) {

        int n=nums.length-1;
        boolean vis[]=new boolean[nums.length];
        int ans=0;

        for(int i=0;i<nums.length;i++)
        {
            if(vis[nums[i]]==false)
            {
                vis[nums[i]]=true;
            }
            else
            {
                ans=nums[i];
            }
        }

        return ans;

       
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }
    
}
