package DAY_100;
/*
# Leetcode 190
*/

public class reverseBits {
    public static int reverseBits(int n) {
        int rev = 0; 
        int c = 32;  
        while(c-->0){
            rev = rev<<1;   
            rev += n & 1;   
            n = n >> 1;  
        }
        return rev;   
    }

    public static void main(String[] args) {
        int ans=reverseBits(4);
        System.out.println(ans);
    }
    
}
