package DAY_16;
/*
# Leetcode 20
*/

import java.util.Stack;

public class validParenthesis {

     public static boolean isValid(String s) {
        Stack<Character> stk=new Stack();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if( c == '(' || c == '[' || c == '{')
            {
                stk.push(c);
            }
            else {
            if(stk.isEmpty())
            {
                return false;
            }

            
            if (c == ')' && stk.peek() == '(') {
                    stk.pop();
                } 
            else if (c == '}' && stk.peek() == '{') {
                    stk.pop();
                }
            else if (c == ']' && stk.peek() == '[') {
                    stk.pop();
                } 
            else{
                    return false;
                }
            }
        }

        return stk.isEmpty();


    }

    public static void main(String[] args) {
        String s="{[()]}";
        boolean ans=isValid(s);
        System.out.println(ans);
    }
    
}
