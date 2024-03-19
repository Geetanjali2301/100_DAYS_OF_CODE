package DAY_30;
/*
# Leetcode 86
*/

public class partitionList {

    public static class ListNode  {
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val=val;
            this.next=null;

        }
    
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(-1);
        ListNode large=new ListNode(-1);
        ListNode smallp=small;
        ListNode largep=large;

        while(head!=null)
        {
            if(head.val<x)
            {
             smallp.next=head;
             smallp=smallp.next;
            }
            else
            {
             largep.next=head;
             largep=largep.next;
            }
            head=head.next;
        }
        smallp.next=large.next;
        largep.next=null;
        return small.next;    
        
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
        h.next=new ListNode(4);
        h.next.next=new ListNode(3);
        h.next.next.next=new ListNode(2);
        h.next.next.next.next=new ListNode(5);

        ListNode ans=partition(h, 3);
        print(ans);

    }

    
    
}
