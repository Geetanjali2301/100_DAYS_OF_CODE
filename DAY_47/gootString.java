package DAY_47;
/*
# Leetcode 1544
*/

public class gootString {

    public static String makeGood(String s) {

      for(int i=0;i<s.length()-2;i++)
      {
        if(Math.abs(s.charAt(i)-s.charAt(i+1))==32)
        {
            return makeGood(s.substring(0,i)+s.substring(i+2));
        }
      }
      return s;
    }

    public static void main(String[] args) {
        String s="leEeetcode";
        String ans=makeGood(s);
        System.out.println(ans);
    }
    
}
