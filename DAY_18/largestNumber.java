package DAY_18;
/*
# Leetcode 179
*/

import java.util.Arrays;

public class largestNumber {

    public static String largest(int[] nums) {
        String[] arr=new String[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i]+"";
        }

        Arrays.sort(arr,(s1,s2)->(s1+s2).compareTo(s2+s1));

        StringBuilder sb=new StringBuilder("");

        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }

        if(sb.charAt(0)=='0')
        {
            return "0";
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int nums[]={10,2};
        String ans=largest(nums);
        System.out.println(ans);
    }
    
}
