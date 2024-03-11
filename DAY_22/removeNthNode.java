package DAY_22;

public class removeNthNode {

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

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null)
        {
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;

        while(n>0)
        {
            fast=fast.next;
            n--;
        }

        if(fast==null)
        {
            return head.next;
        }

        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
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
        h.next.next.next.next=new ListNode(5);

        ListNode ans=removeNthFromEnd(h, 2);
        print(ans);
    }
    
}
