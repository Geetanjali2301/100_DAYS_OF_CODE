package DAY_20;
/* 
# Leetcode 2816
*/

public class doubleNumber {

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
        head=prev;
        return head;

    }

    public static ListNode doubleN(ListNode h)
    {
        ListNode a=reverse(h);

        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;

        ListNode ptr1=a;
        int carry=0;

        while(ptr1!=null)
        {
            int val1=ptr1!=null?ptr1.val:0;
            
            int sum=val1+val1+carry;

            int d=sum%10;
            carry=sum/10;

            ListNode temp=new ListNode(d);
            dummy.next=temp;
            dummy=dummy.next;

            ptr1=ptr1!=null?ptr1.next:null;

        }

        if(carry>0)
        {
            ListNode temp=new ListNode(carry);
            dummy.next=temp;
            dummy=dummy.next;
        }

        return reverse(ans.next);


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
        h.next=new ListNode(8);
        h.next.next=new ListNode(9);

        ListNode ans=doubleN(h);
        print(ans);
    }
    
}
