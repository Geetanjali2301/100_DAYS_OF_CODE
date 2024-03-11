package DAY_22;
/*
# Leetcode 328
*/

public class evenOddLL {

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

    public static ListNode oddEvenList(ListNode head) {

        if(head==null)
        {
            return head;
        }
        else if(head.next==null)
        {
            return head;
        }
        else if(head.next.next==null)
        {
            return head;
        }

        ListNode oddhead=head;
        ListNode evenhead=head.next;
        ListNode evens=evenhead;

        while(evenhead!=null && evenhead.next!=null)
        {
            oddhead.next=oddhead.next.next;
            evenhead.next=evenhead.next.next;

            oddhead=oddhead.next;
            evenhead=evenhead.next;
        }

        oddhead.next=evens;

        return head;
        
    }

    public static void print(ListNode head)
    {
        ListNode ptr=head;
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

        ListNode ans=oddEvenList(h);
        print(ans);
        
    }
    
}
