package DAY_39;
/*
# Leetcode 392
*/

public class isSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int i=0;
        int j=0;
        boolean ans=true;

        while(j<s.length() && i<t.length())
        {
            if(s.charAt(j)==t.charAt(i))
            {
                i++;
                j++;
            }
            else
            {
                i++;       
            }

        } 
        if(j<s.length())
        {
            ans=false;
        }

        return ans;
        
    }

    public static void main(String[] args) {
        String s="abs";
        String t="abbcs";
        boolean ans=isSubsequence(s, t);
        System.out.println(ans);
    }
    
}
