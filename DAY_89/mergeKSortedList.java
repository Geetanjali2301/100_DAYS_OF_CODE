package DAY_89;
/*
#Leetcode 23
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeKSortedList {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int data)
        {
            this.val=data;
            this.next=null;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> x=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
                x.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(x);
        ListNode f=new ListNode(0);
        ListNode t2=f;
        for (int i:x)
        {
            ListNode m=new ListNode(i);
            t2.next=m;
            t2=t2.next;
        }
        return f.next;
   
    }
    
}
