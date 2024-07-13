package DAY_95;
/*
#Leetcode 1823
*/

public class winCircle {

    public static int findTheWinner(int n, int k) {

        int win=0;

        for(int i=1;i<=n;i++)
        {
            win=(win+k)%i;
        }

        return win+1;
        
    }

    public static void main(String[] args) {
        int n=5;
        int k=2;

        int ans=findTheWinner(n, k);
        System.out.println(ans);


    }
    
}
