package DAY_99;
/*
# Leetcode 338
*/

public class countBitsArray {

    public static int countone(int n) {
        int cnt=0;
        for(int i=0;i<32;i++)
        {
            cnt+=(n&1);
            n>>=1;
        }
        return cnt;
        
    }
    public static int[] countBits(int n) {

        int ans[]=new int[n+1];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=countone(i);
        }

        return ans;
        
    }

    public static void main(String[] args) {
        int[] ans=countBits(5);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
