package DAY_51;
/*
# Leetcode 2073
*/

public class tickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {

        int t=0;

        while(tickets[k]!=0)
        {
           
            for(int j=0;j<tickets.length;j++)
            {
                if(tickets[j]!=0)
                {
                    t++;
                    tickets[j]-=1;        
                }
               
                if(tickets[k]==0)
                {
                    break;
                }
            }        
        }

        return t;
        
    }

    public static void main(String[] args) {
        int tickets[]={2,3,2};
        int k=2;
        int ans=timeRequiredToBuy(tickets, k);
        System.out.println(ans);
    }
    
}
