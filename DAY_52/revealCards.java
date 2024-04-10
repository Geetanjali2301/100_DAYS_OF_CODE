package DAY_52;
/*
# Leetcode 950
IMP-> Idea: when we reveal the output cards one by one and follow the processwe got sorted order. So we will use sorted order to get the correct order back by using dq.
*/

import java.util.*;
public class revealCards {

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        Deque<Integer> dq=new ArrayDeque<>();

        dq.add(deck[deck.length-1]);
        for(int i=deck.length-2;i>=0;i--)
        {
            int ele=dq.removeLast();
            //pushing the last element of dq at first
            dq.addFirst(ele);
            //push the corresponding deck element at first
            dq.addFirst(deck[i]);
        }

        int k=0;
        for(int ele:dq)
        {
            deck[k++]=ele;
        }

        return deck;
        
    }

    public static void main(String[] args) {
        int[] deck={17,13,11,2,3,5,7};;
        int ans[]=deckRevealedIncreasing(deck);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
    
}
