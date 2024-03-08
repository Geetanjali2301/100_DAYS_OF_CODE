package DAY_19;
/*
# Leetcode 21
*/

import DAY_19.palindromeLL.ListNode;

public class mergeSortedList {

    public static class Listnode{
        int val;
        Listnode next;

        public Listnode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public static Listnode mergeTwoLists(Listnode list1, Listnode list2) {

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else
            {
                list2.next= mergeTwoLists(list2.next,list1);
                return list2;
            }
        }
        if(list1==null)
        {
            return list2;
        }
       return list1; 
    }

    public static void print_list(Listnode head)
    {
        Listnode ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.val+" ");
            ptr=ptr.next;

        }
    }

    public static void main(String[] args) {

        Listnode list1=new Listnode(1);
        list1.next=new Listnode(2);
        list1.next.next=new Listnode(3);

        Listnode list2=new Listnode(1);
        list2.next=new Listnode(3);
        list2.next.next=new Listnode(4);

        Listnode ans=mergeTwoLists(list1, list2);
        print_list(ans);

    }
    
}
