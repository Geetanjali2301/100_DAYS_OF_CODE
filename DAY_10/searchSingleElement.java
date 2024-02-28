package DAY_10;

/*
# Leetcode 540
*/

public class searchSingleElement {


    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};

        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans^=nums[i];
        }
        
        System.out.println(ans);

        
        
    }
    
}
