package DAY_2;
public class sortedOrNot {
    public static void main(String[] args) {

        int arr[]={1,2,36,4,5,6};
        boolean f=true;
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i+1;
            if(arr[j]<arr[i])
            {
                f=false;
            }
    
        }
        if(f==true)
        {
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }
        
    }
   

    
}
