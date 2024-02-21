package DAY_3;

/*
rotating at every iteration
TC => O(d*n)
*/

public class rotateLeft_approach2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=2;//k is number of elements need to be rotated

        while(k!=0)
        {
            int temp=arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];

            }
            arr[arr.length-1]=temp;
            k--;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
