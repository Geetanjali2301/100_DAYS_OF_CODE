package DAY_3;
/*
# Leetcode 283
*/

public class move_zeroes {

    public static void moveZeroes(int[] nums) {

        int i=0;
        int j=i+1;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[i]!=0)
            {
                i++;
                j++;
            }
            else {
                j++;
            }

        }

    }

    public static void print(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

    }

    public static void main(String[] args) {
        int nums[]={1,0,3,0,0,7,8};
        moveZeroes(nums);
        print(nums);
    }
    
}
