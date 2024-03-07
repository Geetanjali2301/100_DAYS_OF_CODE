package DAY_18;
/*
# Leetcode 1046
*/

import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {

    public static int lastWeight(int[] stones) {

        //max priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }

        while(pq.size()>1)
        {
            int max=pq.remove();
            int smax=pq.remove();

            int ans=max-smax;

            if(ans!=0)
            {
                pq.add(ans);
            }
        }

        if(pq.size()==0)
        {
            return 0;
        }

        return pq.remove();
        
    }

    public static void main(String[] args) {
        int[] stones={2,7,4,1,8,1};
        int ans=lastWeight(stones);
        System.out.println(ans);
    }
    
}
