package DAY_3;
/*
# Leetcode 189
Pick last k elements and place them in the start
*/

public class rotateRight {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;

        while(k!=0)
        {
            int temp=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i-- )
            {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            k--;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
