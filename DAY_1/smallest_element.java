package DAY_1;
import java.util.*;

public class smallest_element {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an element: ");
        int n=sc.nextInt();
        int arr[]=new int[n];


        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("The minimum element of the array is: "+min);
        
    }

    
    
}
