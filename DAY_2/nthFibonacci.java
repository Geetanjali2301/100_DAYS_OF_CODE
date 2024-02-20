package DAY_2;
import java.util.*;

/*
# Leetcode 509
*/

public class nthFibonacci {

    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Nth fibonacci is: "+fib(n));
    }
    
}
