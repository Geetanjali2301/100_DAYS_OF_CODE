package DAY_17;


import java.util.*;
public class duplicateLetters {

    public static void main(String[] args) {
        String s="cbacdcbc";
        char arr[]=s.toCharArray();
        String ans="";
        
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(i==0 && arr[i+1]!=arr[i])
            {
                ans+=arr[i];
            }
            else
            {
                char temp=arr[i-1];
                if(arr[i]!=temp)
                {
                    ans+=arr[i];
                }

            }

           

        }

        System.out.println(ans);

    }
    
}
