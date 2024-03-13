package DAY_24;
/*
# Leetcode 237
*/

public class deleteNode {

    public static class ListNode{
        int val;
        ListNode next;

        public  ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }

    }

    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        
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
        ListNode h=new ListNode(1);
        h.next=new ListNode(2);
        h.next.next=new ListNode(5);
        h.next.next.next=new ListNode(7);
        h.next.next.next.next=new ListNode(3);

        deleteNode(h.next.next);
        print(h);

    }
    
}
