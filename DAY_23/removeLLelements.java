package DAY_23;

public class removeLLelements {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode curr=temp;

        while(curr.next!=null)
        {
            
            if(curr.next.val==val)
            {
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
            

        }
        return temp.next;
        
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
        h.next.next=new ListNode(6);
        h.next.next.next=new ListNode(3);
        h.next.next.next.next=new ListNode(6);

        ListNode ans=removeElements(h, 6);
        print(ans);

    }
    
}
