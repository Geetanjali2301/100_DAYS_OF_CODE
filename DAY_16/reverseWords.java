package DAY_16;
/*
# Leetcode 151
*/

import java.util.ArrayList;

public class reverseWords {

    public static String reverse_Words(String s) {

        String[] ans = s.trim().split("\\s+");
        String s1="";
        for(int i=ans.length-1;i>=1;i--)
        {
    
            s1+=ans[i]+" ";      
        }

        return s1+ans[0];
        
    }

    public static void main(String[] args) {
        String s="sky is blue";
        System.out.println(reverse_Words(s));
    }
    
}
