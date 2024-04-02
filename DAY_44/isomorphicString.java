package DAY_44;
/*
# Leetcode 205
*/

import java.util.HashMap;
import java.util.Map;

public class isomorphicString {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }

        Map<Character,Character> m=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char original=s.charAt(i);
            char replacement=t.charAt(i);

            if(!m.containsKey(original))
            {
                if(!m.containsValue(replacement))
                {
                    m.put(original,replacement);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                char mappedchar=m.get(original);
                if(mappedchar!=replacement)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="egg";
        String t="add";

        boolean ans=isIsomorphic(s, t);
        System.out.println(ans);
    }
    
}
