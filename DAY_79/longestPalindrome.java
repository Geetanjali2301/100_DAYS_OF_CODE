package DAY_79;

import java.util.HashSet;
import java.util.Set;

public class longestPalindrome {

    public static int longestP(String s) {

        Set<Character> ch = new HashSet<>();
        int len = 0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(ch.contains(c)){
                len +=2;
                ch.remove(c);
            }else{
                ch.add(c);
            }
        }
        return len+(ch.size()>0?1:0);
        
    }

    public static void main(String[] args) {
        String s="abccccdd";
        int ans=longestP(s);
        System.out.println(ans);

    }
    
}
