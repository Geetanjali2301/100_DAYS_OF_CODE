package DAY_19;

public class removeDup {

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
        ListNode node=head;
        
        while(node!=null )
        {
            if(node.next == null)
            {
                break;
            }
            if(node.val == node.next.val)
            {
                node.next=node.next.next;
            }
            else
            {
                node=node.next;
                
            }

        }
        return head;
        
    }

    public static void print(ListNode h)
    {
        ListNode ptr=h;
        while(ptr!=null)
        {
            System.out.print(ptr.val+" ");;
            ptr=ptr.next;
        }
    }

    public static void main(String[] args) {
        
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(1);
        l1.next.next=new ListNode(2);
        l1.next.next.next=new ListNode(2);

        ListNode h=deleteDuplicates(l1);
        print(h);
    }
    
}
