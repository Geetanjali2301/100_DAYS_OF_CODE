package DAY_64;

public class uglyNum {

    public static boolean isUgly(int n) {

        if(n==1)
        {
            return true;
        }
        while(n > 1) {
            if(n%2 == 0)
                n = n /2;
            else if(n%3 == 0)
                n = n /3;
            else if(n%5 == 0)
                n = n /5;
            else
                return false;
        }
        return (n == 1);   
    }

    public static void main(String[] args) {
        int n=6;
        boolean ans=isUgly(n);
        System.out.println(ans);

    }
    
}
