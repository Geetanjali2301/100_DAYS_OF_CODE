package DAY_29;
/*
# Leetcode 24
*/

import DAY_18.lastStoneWeight;

public class swapNodesinPairs {

    public static class ListNode
    {
        int val;
        ListNode next;

        public ListNode(int val)
        {
           this.val=val;
           this.next=null;
        }
    
    }

    public static ListNode swapPairs(ListNode head) {

        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null && curr.next!=null)
        {
            
            prev.next=curr.next;
            curr.next=prev.next.next;
            prev.next.next=curr;

            prev=curr;
            curr=curr.next;
        }

        return dummy.next;
        
    }

    public static void print(ListNode h)
    {
        ListNode ptr=h;
        while(ptr!=null)
        {
            System.out.print(ptr.val+" ");
            ptr=ptr.next;

        }
    }

    public static void main(String[] args) {
        ListNode h=new ListNode(1);
        h.next=new ListNode(2);
        h.next.next=new ListNode(3);
        h.next.next.next=new ListNode(4);

        ListNode ans=swapPairs(h);
        print(ans);
    }
    
    
}
