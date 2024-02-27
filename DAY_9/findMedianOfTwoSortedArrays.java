package DAY_9;

/*
# Leetcode 4
*/

import java.util.Arrays;

public class findMedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];

        int i=0,j=0,k=0;
        while(i<nums1.length)
        {
            ans[k]=nums1[i];
            k++;
            i++;
        }

        while(j<nums2.length)
        {
            ans[k]=nums2[j];
            k++;
            j++;
        }

        Arrays.sort(ans);
        int len=ans.length;

        if(len%2==0)
        {
            double a=ans[len/2];
            double b=ans[(len/2)-1];
            return (a+b)/2;
        }

        return ans[len/2];   
    }

    public static void main(String[] args) {
        int arr1[]={1,2};
        int arr2[]={3,4};
        double ans=findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);

    }
    
}
