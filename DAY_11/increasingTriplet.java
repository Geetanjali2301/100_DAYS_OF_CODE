package DAY_11;

public class increasingTriplet {

    public static boolean isTriplet(int arr[])
    {
       for(int i=0;i<arr.length-3;i++)
       {
        int j=i+1;
        while(j<arr.length-1)
        {
            if(arr[j]<arr[i])
            {
                j++;
            }
            else
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]<arr[j] && arr[j]<arr[k])
                    {
                        return true;
                    }
                }
            }
            j++;
        }
    }
  
        return false;

    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        boolean ans=isTriplet(arr);
        System.out.println(ans);

    }
    
}
