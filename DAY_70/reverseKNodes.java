package DAY_70;

public class reverseKNodes {

    public static class ListNode{
        int data;
        ListNode  next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static ListNode getKthNode(ListNode start,int k){
        k=k-1;
        while(start!=null && k>0){
            start=start.next;
            k--;
        }
        return start;
    }

    //reverse ll
    public static ListNode reverse(ListNode start)
    {
        ListNode prev=null;
        ListNode curr=start;

        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return curr;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode start=head;
        ListNode prev=null;

        while(start!=null){
            
            ListNode end=getKthNode(start,k);

            /* if kth node is null
            */

            if(end==null){
                prev.next=start;
                break;
            }

            ListNode newNode=end.next;
            end.next=null;
            
            reverse(start);

            if(start==head){
                head=end;
            }else{
                prev.next=end;
            }
            prev=start;
            start=newNode;
        }
       return head; 
    }

    public static void print(ListNode s)
    {
        ListNode temp=s;
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

       ListNode n = reverseKGroup(head,2);
       print(n);
    }
    
}
