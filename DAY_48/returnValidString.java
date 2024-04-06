package DAY_48;
/*
# Leetcode 1249
*/

public class returnValidString {

    public static String minRemoveToMakeValid(String s) {

        char ch[]=s.toCharArray();

        //left->right
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='(')
            {
                c++;
            }
            else if(ch[i]==')')
            {
                if(c>0)
                {
                    c--;
                }
                else
                {
                    ch[i]=0;
                }
            }
        }


        //right->left
        c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(ch[i]==')')
            {
                c++;
            }
            else if(ch[i]=='(')
            {
                if(c>0)
                {
                    c--;
                }
                else
                {
                    ch[i]=0;
                }
            }
        }

        StringBuilder ans=new StringBuilder();
        for(char cha:ch)
        {
            if(cha!=0)
            {
                ans.append(cha);
            }
        }

        return ans.toString();
        
    }

    public static void main(String[] args) {
        String s="lee(t(c)o)de)";
        String ans=minRemoveToMakeValid(s);
        System.out.println(ans);
    }
    
}
