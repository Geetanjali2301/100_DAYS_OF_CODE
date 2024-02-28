package DAY_10;
/*
# Leetcode 48
*/

public class rotateImage {

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int nums[][]=new int[arr.length][arr.length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                int x=arr.length-i-1;
                nums[j][x]=arr[i][j];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
