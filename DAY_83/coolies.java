package DAY_83;
/*
#Leetcode 455
*/

import java.util.Arrays;

public class coolies {

    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int c1=0;
        int c2=0;

        while(c1<g.length && c2<s.length)
        {
            if(g[c1]<=s[c2])
            {
                c1++;
            }
            c2++;
        }

        return c1;
        
    }

    public static void main(String[] args) {
        int g[]={1,2};
        int s[]={1,2,3};
        int ans=findContentChildren(g, s);
        System.out.println(ans);
    }
    
}
