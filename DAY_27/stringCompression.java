package DAY_27;
/*
# Leetcode 443
*/

public class stringCompression {

    public static int compress(char[] chars) {

        int count=1;
        StringBuilder sb=new StringBuilder("");

        sb.append(chars[0]);

        for(int i=1;i<chars.length;i++)
        {
            if(chars[i-1]!=chars[i])
            {
                if(count>1)
                {
                    sb.append(count+"");
                }
                sb.append(chars[i]);
                count=1;
            }
            else
            {
                count++;
            }
        }

        if(count>1)
        {
            sb.append(count+"");
        }

        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            chars[i]=ch;
        }

        return sb.length();
        
    }

    public static void main(String[] args) {
        char chars[]={'a','a','b','b','b','c','c'};
        int ans=compress(chars);
        //print length of new string after compressing
        System.out.println(ans);
    }


    
}
