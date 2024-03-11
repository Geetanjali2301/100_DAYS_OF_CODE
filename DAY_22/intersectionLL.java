package DAY_22;
/*
# Leetcode 160
*/

public class intersectionLL {

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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int countA=1;
        int countB=1;
        ListNode ptrA=headA;
        ListNode ptrB=headB;

        while(ptrA!=null)
        {
            countA++;
            ptrA=ptrA.next;
        }

        while(ptrB!=null)
        {
            countB++;
            ptrB=ptrB.next;
        }

        int id=0;
        ListNode ptra=headA;
        ListNode ptrb=headB; 
        if(countA>countB)
        {
            id=countA-countB;
           
            while(id>0)
            {
            ptra=ptra.next;
            id--;
            }
        }
        else
        {
            id=countB-countA;
            
            while(id>0)
            {
            ptrb=ptrb.next;
            id--;
            }
        }
        
        while(ptra!=null && ptrb!=null)
        {
            if(ptra==ptrb)
            {
                return ptra;
            }
            ptra=ptra.next;
            ptrb=ptrb.next;
        }

        return null;
        
    }

    public static void main(String[] args) {

        ListNode h1=new ListNode(4);
        h1.next=new ListNode(1);
       
        ListNode h2=new ListNode(5);
        h2.next=new ListNode(6);
        h2.next.next=new ListNode(1);

        h1.next.next=h2.next.next.next=new ListNode(8);
        h1.next.next.next=h2.next.next.next.next=new ListNode(4);


        ListNode ans=getIntersectionNode(h1,h2);
        System.out.print(ans.val);
        
        
    }
    
}
