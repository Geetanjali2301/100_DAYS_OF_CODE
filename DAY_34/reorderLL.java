package DAY_34;

public class reorderLL {
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

    public static ListNode mid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    public static ListNode reorderList(ListNode head) {

        ListNode mid=mid(head);
        ListNode head2=reverse(mid);

        ListNode ptr1=head;
        ListNode ptr2=head2;
        

        while(ptr2.next!=null)
        {
            ListNode temp;
            ListNode temp2;
            temp=ptr1.next;
            temp2=ptr2.next;
            ptr1.next=ptr2;
            ptr2.next=temp;
            ptr1=temp;
            ptr2=temp2;
        }
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

        ListNode ans=reorderList(h);
        print(ans);
    }
    
}
