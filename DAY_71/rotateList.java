package DAY_71;

public class rotateList {

    public static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {

        if(head==null)
        {
            return head;
        }

        int len=1;
        ListNode tail=head;

        while(tail.next!=null)
        {
            tail=tail.next;
            len++;
        }

        if(k%len==0)
        {
            return head;
        }

        tail.next=head;
        k=k%len;      
        ListNode temp=head;

        for(int i=1;i<len-k;i++)
        {
            temp=temp.next;
        }

        ListNode ans=temp.next;
        temp.next=null;

        return ans;
       
    }

    public static void print(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        ListNode ans=rotateRight(head, 2);
        print(ans);
    }
    
}
