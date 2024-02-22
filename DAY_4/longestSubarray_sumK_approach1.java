package DAY_4;
/*
TC => O(n^2)
*/

public class longestSubarray_sumK_approach1 {
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int k=15;

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    count=Math.max(count,j-i+1);

                }

            }
        }

        System.out.println(+count);
    }
    
}
