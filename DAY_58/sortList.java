package DAY_58;

import java.util.*;
public class sortList {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public static ListNode sortList(ListNode head) {

        if(head==null||head.next==null)
            return head;

        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();

        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }

        Collections.sort(arr);
        ListNode n=new ListNode(0);
        ListNode h=n;
        for(int a:arr)
        {
            n.next=new ListNode(a);
            n=n.next;
        }
        return h.next;
        
    }

    public static void print(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        head.next=new ListNode(3);
        head.next.next=new ListNode(0);
        ListNode ans=sortList(head);
        print(ans);

    }
    
}
