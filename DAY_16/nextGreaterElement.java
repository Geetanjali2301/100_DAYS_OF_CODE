package DAY_16;
/*
# Leetcode 496
*/

import java.util.Stack;

public class nextGreaterElement {

    public static void main(String[] args) {

        int nums1[]={4,1,2};
        int nums2[]={4,3,1,2};

        
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int nextgreater=-1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    int k=j+1;
                    while(k<nums2.length)
                    {
                        if(nums2[k]>nums2[j])
                        {
                            nextgreater=nums2[k];
                            break;

                        }
                        k++;
                    }

                }
            }

            
           ans[i]=nextgreater;
        }

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        
       
    }
    
}
