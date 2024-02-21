package DAY_3;
/*
# Leetcode 26
TC => O(n)  
SC => O(1)
*/

public class remove_Duplicates {

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
    
        }
        return i+1;
    }

    public static void main(String[] args) {
        int nums[]={1,1,2,2,2,3,3,4,4};
        int ans=removeDuplicates(nums);
        System.out.println("Total number of non duplicates are: "+ans);
    }
    
}
