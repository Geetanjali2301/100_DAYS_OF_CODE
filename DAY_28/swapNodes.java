package DAY_28;
/*
# Leetcode 1721
*/

import java.util.List;

public class swapNodes {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode swapNodes(ListNode head, int k) {

        int size=1;
        ListNode t=head;
        while(t!=null)
        {
            t=t.next;
            size++;
        }

        int i=1;
        int j=1;
        ListNode ptr1=head;
        ListNode ptr2=head;

        while(i!=k)
        {
            ptr1=ptr1.next;
            i++;
        }

        int value=(size-k);
        while(j!=value)
        {
            ptr2=ptr2.next;
            j++;

        }

        int temp=ptr1.val;
        ptr1.val=ptr2.val;
        ptr2.val=temp;

        return head;
        
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
        h.next.next.next.next=new ListNode(5);
        int k=2;

        ListNode ans=swapNodes(h, k);
        print(ans);

    }
    
}
