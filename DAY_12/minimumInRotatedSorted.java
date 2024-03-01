package DAY_12;
/*
# Leetcode 153
*/

public class minimumInRotatedSorted {

    public static int findMin(int[] arr) {

        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int mid=(i+j)/2;
            if(arr[j]<arr[mid])
            {
                i=mid+1;
            }
            else
            {
                j=mid;
            }
        
        }
        return arr[i];
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        int ans=findMin(arr);
        System.out.println(ans);
    }
    
}
