package DAY_96;
/*
#Leetcode 70
*/

public class climbingStairs {

    public static int climbStairs(int n) {
        int one=1,two=1;
        for(int i=0;i<n-1;i++)
        {
            int temp=one;
            one=one+two;
            two=temp;
        }
        return one;
    }

    public static void main(String[] args) {
        int n=3;
        int ans=climbStairs(n);
        System.out.println(ans);
    }
    
}
