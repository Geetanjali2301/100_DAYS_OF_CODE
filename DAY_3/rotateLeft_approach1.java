package DAY_3;

/*
TC => O(n)
*/

public class rotateLeft_approach1 {

    public static void rev(int arr[],int low,int high)
    {
        while(low<=high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=2; //k is number of elements need to be rotated

        rev(arr,0,k);
        rev(arr,k+1,arr.length-1);
        rev(arr,0,arr.length-1);

        print(arr);


    }
    
}
