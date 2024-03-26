package DAY_37;
/*
# Leetcode 82
*/

import DAY_21.largestNumTwice;

public class removeDuplicate2 {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null)
        {
            boolean f=false;

            while(curr.next!=null && curr.next.val==curr.val)
            {
                curr=curr.next;
                f=true;
            }

            if(f)
            {
                prev.next=curr.next;
            }
            else
            {
                prev=curr;
            }
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
        h.next.next=new ListNode(2);
        h.next.next.next=new ListNode(4);

        ListNode ans=deleteDuplicates(h);
        print(ans);
    }
    
}
