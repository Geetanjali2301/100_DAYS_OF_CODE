package DAY_19;
/*
# Leetcode 2059
*/

public class deleteMiddleLL {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public static ListNode deleteMiddle(ListNode head) {

        if(head.next==null)
        {
            return null;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=slow;
        
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;

        }

        temp.next=slow.next;
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
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(4);

        ListNode h=deleteMiddle(l);
        print(h);
    }
}
