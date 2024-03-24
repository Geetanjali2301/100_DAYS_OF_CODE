package DAY_35;
/*
# Leetcode 2485
*/

public class pivotInteger {

    public static int pivot(int n){

        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }

        int leftsum[]=new int[n];
        int rightsum[]=new int[n];

        leftsum[0]=arr[0];
        rightsum[n-1]=arr[n-1];

        for(int i=1;i<n;i++)
        {
            leftsum[i]=leftsum[i-1]+arr[i];
        }

        for(int j=n-2;j>=0;j--)
        {
            rightsum[j]=rightsum[j+1]+arr[j];
        }

        int i=0;
        int j=0;
        while(i<n && j<n)
        {
            if(leftsum[i]==rightsum[j])
            {
                return arr[i];
            }
            i++;
            j++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int ans=pivot(8);
        System.out.println(ans);
    }
    
}
