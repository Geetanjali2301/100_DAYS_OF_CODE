package DAY_8;
/*
# Leetcode 1464
*/

public class maxProduct {

    public static int maxProduct(int[] nums) {
        int maxproduct=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(((nums[i]-1)*(nums[j]-1))>maxproduct)
                {
                    maxproduct=(nums[i]-1)*(nums[j]-1);
                }

            }
        }
        return maxproduct;
        
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,2};
        int ans=maxProduct(arr);
        System.out.println(ans);
    }


    
}
