package DAY_13;
/*
# Leetcode 215
O(n)
*/

import java.util.PriorityQueue;

public class kthLargest2 {

    public static int findKthLargest(int nums[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>((el1,el2)->el2-el1);

        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }

        for(int i=0;i<k-1;i++)
        {
            pq.poll();
        }

        return pq.poll();

    }

    public static void main(String[] args) {
        int nums[]={3,5,7,1,8,5,6};
        int k=2;
        int ans=findKthLargest(nums, k);
        System.out.println(ans);
    }
    
}
