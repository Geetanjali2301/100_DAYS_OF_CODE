package DAY_75;

public class setBits {

    public static int hammingWeight(int n) {
        int cnt=0;
        for(int i=0;i<32;i++)
        {
            cnt+=(n&1);
            n>>=1;
        }
        return cnt;
        
    }

    public static void main(String[] args) {
        int n=11;
        int ans=hammingWeight(n);
        System.out.println(ans);
    }
    
}
