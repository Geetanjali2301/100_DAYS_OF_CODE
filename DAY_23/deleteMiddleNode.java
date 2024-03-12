package DAY_23;
/*
# Leetcode 2095
*/

public class deleteMiddleNode {

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
        ListNode h=new ListNode(1);
        h.next=new ListNode(3);
        h.next.next=new ListNode(4);
        h.next.next.next=new ListNode(5);

        ListNode ans=deleteMiddle(h);
        print(ans);
    }
}
