package DAY_67;

import java.util.HashSet;
import java.util.Set;

public class longestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int n=s.length();
        int maxlen=0;
        int i=0;
        Set<Character> c=new HashSet<>();

        for(int j=0;j<n;j++)
        {
            if(!c.contains(s.charAt(j)))
            {
                c.add(s.charAt(j));
                maxlen=Math.max(maxlen,j-i+1);
            }
            else
            {
                while(c.contains(s.charAt(j)))
                {
                    c.remove(s.charAt(i));
                    i++;
                }
                c.add(s.charAt(j));
            }
        }

        return maxlen;
        
    }

    public static void main(String[] args) {
        String s="abdzsabs";
        int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    
}
