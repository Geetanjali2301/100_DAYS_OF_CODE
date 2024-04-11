package DAY_53;
/*
# Leetcode 402
*/

import java.util.*;
public class removedigits {

    public static String removeKdigits(String num, int k) {

        Stack<Character> s=new Stack<>();

        for(char ch:num.toCharArray())
        {
            while(!s.isEmpty() && k>0 && s.peek()>ch)
            {
                s.pop();
                k--;
            }
            s.push(ch);
        }

        while(!s.isEmpty() && k>0)
        {
            s.pop();
            k--;
        }

        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        sb.reverse();

        while(sb.length()>1 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }

        return (sb.length()>0) ? sb.toString():"0";
        
    }

    public static void main(String[] args) {
        String s="1432231";
        int k=3;
        String ans=removeKdigits(s, k);
        System.out.println(ans);

    }
    
}
