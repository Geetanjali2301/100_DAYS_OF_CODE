package DAY_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addToArrayFormOfInt {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int num1=0,i=0;
        while(i<num.length)
        {
            num1=num1*10+num[i];
            i++;
        }
        
        int sum=num1+k;

        System.out.println(sum);
        while(sum>0)
        {
            ans.add(sum%10);
            sum/=10;
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int num[]={9,9,9,9,9,9,9,9,9};
        int k=34;
        List<Integer>ans=addToArrayForm(num, k);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }

    }
}
    

