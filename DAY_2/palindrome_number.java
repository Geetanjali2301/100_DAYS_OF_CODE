package DAY_2;
import java.util.*;
/*
# Leetcode 9
Time complexity for this program is O(n)
*/

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a palindrome or not: ");
        int n=sc.nextInt();

        int temp=n;
        int rev=0;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        if(temp==rev)
        {
            System.out.println("It is a palindrome number!");
        }
        else{
            System.out.println("It is not a palindrome number!");
        }
        
        
    }
    
}
