package DAY_11;

public class containerWithMostWater {

    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};

        int i=0;
        int j=arr.length-1;
        int currwater=0;
        int max=0;

        while(i<j)
        {
            currwater=(j-i)*Math.min(arr[i],arr[j]);
            if(arr[i]<arr[j])
            {
                i++;
            }
            else
            {
                j--;
            }

            if(currwater>max)
            {
                max=currwater;
            }
            
        }

        System.out.println("Max water is: "+max+" units");

    }
    
}
