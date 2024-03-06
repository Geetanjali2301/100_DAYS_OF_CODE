package DAY_17;

public class pivotIndex {

    public static int pivot(int[] nums) {

        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];

        leftsum[0]=0;
        rightsum[nums.length-1]=0;

        int lsum=0;
        int rsum=0;
        int ans=-1;

        for(int i=1;i<nums.length;i++)
        {
            lsum=leftsum[i-1]+nums[i-1];
            leftsum[i]=lsum;
        }
        
        for(int i=nums.length-2;i>=0;i--)
        {
            rsum=rightsum[i+1]+nums[i+1];
            rightsum[i]=rsum;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(leftsum[i]==rightsum[i])
            {
                ans=i;
                break;
            }
        }

        return ans;
        
    }

    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        int idx=pivot(arr);
        System.out.println(idx);
    }
    
}
