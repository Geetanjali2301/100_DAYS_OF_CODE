package DAY_25;

public class binarySumSubarray {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int c=0;
        int sum=0;

       for(int i=0;i<nums.length;i++)
       {
           for(int j=i;j<nums.length;j++)
           {
               sum+=nums[j];
               if(sum==goal){
                   c++;
               }


               if(sum>goal)
               {
                   break;
               }
           }
           sum=0;
       }
    return c;
       
   }

   public static void main(String[] args) {

    int nums[]={1,0,1,0,1};
    int goal=2;
    int ans=numSubarraysWithSum(nums, goal);
    System.out.println(ans);
    
   }
    
}
