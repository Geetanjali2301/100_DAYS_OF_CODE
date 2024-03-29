package DAY_20;
/*
# Leetcode 2540
*/

public class minCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {

        int i=0;
        int j=0;
        while(i<nums1.length && j< nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                return nums1[i];
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return -1;
        
    }


    public static void main(String[] args) {

        int nums1[]={1,2,3,4};
        int nums2[]={2,3,4};
        int ans=getCommon(nums1, nums2);
        System.out.println(ans);
        
    }


    
}
