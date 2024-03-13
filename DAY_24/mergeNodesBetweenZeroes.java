package DAY_24;
/*
# Leetcode 2181
*/

public class mergeNodesBetweenZeroes {

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

    public static ListNode mergeNodes(ListNode head) {

        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;

        int sum=0;
        ListNode ptr=head.next;

        while(ptr!=null)
        {
            if(ptr.val!=0)
            {
                sum+=ptr.val;  
            }
            else
            {
                ListNode temp=new ListNode(sum);
                dummy.next=temp;
                dummy=dummy.next;
                sum=0;

            }
            ptr=ptr.next;
        }

        return ans.next;
        
    }

    public static void print(ListNode h)
    {
        ListNode ptr=h;
        while (ptr!=null) {
            
            System.out.print(ptr.val+" ");
            ptr=ptr.next;     
        }
    }

    public static void main(String[] args) {
        ListNode h=new ListNode(0);
        h.next=new ListNode(2);
        h.next.next=new ListNode(3);
        h.next.next.next=new ListNode(0);
        h.next.next.next.next=new ListNode(1);
        h.next.next.next.next.next=new ListNode(0);

        ListNode ans=mergeNodes(h);
        print(ans);
    }
    
}
