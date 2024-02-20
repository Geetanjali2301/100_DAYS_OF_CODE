package DAY_2;
import java.util.*;
/*
# Leetcode 231
*/

public class powerOfTwo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is power of 2 or not");
        int n=sc.nextInt();

        if(n==1)
        {
            System.out.println("True");
        }
        else if(n==0)
        {
           System.out.println("False");
        }
        while(n%2==0)
        {
            n=n>>1;
        }

        if(n==1)
        {
            System.out.println("True");;
        }
        else{
            System.out.println("False");
        }
        
    }
    
    
}
