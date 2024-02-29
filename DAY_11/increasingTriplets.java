public class increasingTriplets {

    public static boolean increasing_Triplet(int[] arr) {

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<first)
            {
                first=arr[i];
            }
            else if(arr[i]>first && arr[i]<second)
            {
                second=arr[i];
            }

            if(arr[i]>second)
            {
                return true;
            }
        }

        return false;

}

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        boolean ans=increasing_Triplet(arr);
        System.out.println(ans);
        
    }
    
}
