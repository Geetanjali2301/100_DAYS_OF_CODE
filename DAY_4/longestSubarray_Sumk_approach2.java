package DAY_4;
/*
TC => O(n)
*/

public class longestSubarray_Sumk_approach2 {
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int k=15;

        int i=0,j=0;
        int sum=0;
        int count=0;
        while(j<arr.length)
        {
            sum+=arr[j];
            if(sum<k)
            {
                j++;
            }
            else if(sum==k)
            {
                count=Math.max(count,j-i+1);
                j++;
            }
            else if(sum>k)
            {
                while (sum > k) {
                    sum -= arr[i];
                    i++;
                  }
                  if(sum == k){
                    count= Math.max(count, j-i+1);
                  }
                  j++;

            }

        }

        System.out.println(count);
    }
    
}
