package DAY_46;
/*
# Leetcode 1614
*/

public class nestingDepthParenthesis {

    public static int maxDepth(String s) {
        int count=0;
        int max=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
        }

        return max;
        
    }

    public static void main(String[] args) {
        String s="(1+(2+(8)))";
        int ans=maxDepth(s);
        System.out.println(ans);

    }
    
}
