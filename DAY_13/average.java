package DAY_13;
/*
# Leetcode 1491
*/

import java.util.Arrays;

public class average {

    public static double average_sal(int[] salary) {

        Arrays.sort(salary);
        
        double sum=0;
        int count=0;

        for(int i=1;i<salary.length-1;i++)
        {
            sum+=salary[i];
            count++;
        }

        double avg=sum / count;
        return avg;
        
    }
    public static void main(String[] args) {
        int arr[]={4000,3000,1000,2000};
        double ans=average_sal(arr);
        System.out.println(ans);

    }

    
}
