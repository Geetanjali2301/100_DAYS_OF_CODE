package DAY_20;
/*
# Leetcode 2
*/

public class addTwoNumbers {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val=val;
            this.next=null;

        }

    }

    public static ListNode add(ListNode l1,ListNode l2)
    {
        if(l1==null)
        {
            return l2;
        }
        else if(l2==null)
        {
            return l1;
        }

        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;

        ListNode ptr1=l1;
        ListNode ptr2=l2;
        int carry=0;

        while(ptr1!=null || ptr2!=null)
        {
            int val1=ptr1!=null?ptr1.val:0;
            int val2=ptr2!=null?ptr2.val:0;
            

            int sum=val1+val2+carry;

            int d=sum%10;
            carry=sum/10;

            ListNode temp=new ListNode(d);
            dummy.next=temp;
            dummy=dummy.next;

            ptr1=ptr1!=null?ptr1.next:null;
            ptr2=ptr2!=null?ptr2.next:null;


        }

        if(carry>0)
        {
            ListNode temp=new ListNode(carry);
            dummy.next=temp;
            dummy=dummy.next;

        }

        return ans.next;

    }

    public static void print(ListNode h)
    {
        ListNode ptr=h;
        while(ptr!=null)
        {
            System.out.println(ptr.val+" ");
            ptr=ptr.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode ans=add(l1, l2);
        print(ans);

    }
    
}
