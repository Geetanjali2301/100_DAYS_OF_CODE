package DAY_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addToArrayFormOfInt {

    public static List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> ans=new ArrayList<>();
       int len=num.length-1;
       while(len>=0 || k>0)
       {
           if(len>=0)
           {
               k+=num[len--];
           }
           int rem=k%10;
           ans.add(rem);
           k/=10;
       }
       Collections.reverse(ans);
       return ans;
    }

    public static void main(String[] args) {
        int num[]={1,2,0,0};
        int k=34;
        List<Integer> ans=addToArrayForm(num, k);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }

    }
}
    

