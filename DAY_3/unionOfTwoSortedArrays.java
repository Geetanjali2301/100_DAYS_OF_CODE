package DAY_3;
/*
Union of 2 sorted arrays with no duplicates
*/

public class unionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[]={1,3,5,8};
        int arr2[]={2,7,9};

        int i=0,j=0;

        while(i<arr1.length && j<arr2.length) {

            if(arr1[i]<arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                System.out.print(arr2[j]+" ");
                j++;
            }
            else
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;

            }

        }

        if(i<arr1.length)
        {
            System.out.print(arr1[i]+" ");
            i++;

        }

        if(j<arr2.length)
        {
            System.out.print(arr2[j]+" ");
            j++;

        }
        
    }
    
}
