package DAY_19;

public class palindromeLL {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public static boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null)
        {
            return true;
        }

        ListNode hare=head;
        ListNode turtle=head;
        while(hare!=null && hare.next!=null)
        {
            hare=hare.next.next;
            turtle=turtle.next;
        }
        ListNode mid=turtle;

        ListNode prev=null;
        ListNode curr=mid;
        ListNode temp;

        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode head1 = head;
        ListNode head2 = prev;

        while(head1!=null && head2!=null)
        {
            if(head1.val!=head2.val)
            {
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }

        return true;      
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);

        boolean ans=isPalindrome(head);
        System.out.println(ans);

    }
    
}
