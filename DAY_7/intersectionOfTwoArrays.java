package DAY_7;
/*
#Leetcode 349
*/

import java.util.HashSet;

public class intersectionOfTwoArrays {

     public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i : nums1)
        {
            s1.add(i);
        }

        for(int i : nums2){

            if(s1.contains(i)) 
            s2.add(i);
        }

        int[] res = new int[s2.size()];
        int i = 0;
        
        for(int n : s2)
        {
            res[i++] = n;
        }
        return res;     
    }

    public static void main(String[] args) {

        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        int ans[]=intersection(nums1, nums2);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

        
    }


    
}
