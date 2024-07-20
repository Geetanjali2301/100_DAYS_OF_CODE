package DAY_98;
/*
#Leetcode 371
*/

public class addNumBitwise {

    public static int getSum(int a, int b) {

        while(b!=0)
        {
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
        
    }

    public static void main(String[] args) {
        int a=3;
        int b=2;

        int ans=getSum(a, b);
        System.out.println(ans);
    }
    
}
