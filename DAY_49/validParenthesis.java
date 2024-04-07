package DAY_49;
/*
# Leetcode 678
*/

public class validParenthesis {

    public static boolean checkValidString(String s) {

        int i = 0, j = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                i++;
                j++;
            } else if (c == ')') {
                i--;
                j--;
            } else {
                i--;
                j++;
            }
            if (j< 0) {
                return false;
            }

            if (i < 0) {
                i = 0;
            }
        }
        return i == 0;   
    }

    public static void main(String[] args) {

        String s="(*)";
        boolean ans=checkValidString(s);
        System.out.println(ans);
        
    }
    
}
