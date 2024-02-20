package DAY_2;
/*
# Leetcode 560
*/
public class subarraySumK {

    public static void main(String[] args) {
        int arr[]={1,2,1,2,2,1,2,1};
        int k=3;
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    count++;
                }
            }
        }
        System.out.println("Total number of subarrays with sum k : "+count);
    }
    
}
