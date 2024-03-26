package DAY_37;
/*
# Leetcode 41
*/
public class firstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;

        //This loop is used to arrange elements at their respective val-1 index position.
        while(i<n)
        {
            int c=nums[i]-1;
            if(nums[i]>0 && c<n)
            {
                if(nums[i]!=nums[c])
                {
                    int temp=nums[i];
                    nums[i]=nums[c];
                    nums[c]=temp;
                }
                else
                {
                    i++;
                }
            }
            else
            {
                i++;
            }
        }


        //Once arranged in array we can traverse and check for recquired element.
        for(int k=0;k<n;k++)
        {
            if(nums[k]!=k+1)
            {
                return k+1;
            }
        }

        //If complete array is traversed and all elements are place at correct positions then return n+1.
        return n+1;
        
        
    }

    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        int ans=firstMissingPositive(arr);
        System.out.println(ans);
    }
    
}
