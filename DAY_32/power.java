package DAY_32;
/*
# Leetcode 50
*/

public class power {

    public static double myPow(double x, int n) {
        
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;
    }

    public static void main(String[] args) {
        double x=2.00000;
        int n=10;
        double ans=myPow(x, n);
        System.out.println(ans);
    }
    
}
