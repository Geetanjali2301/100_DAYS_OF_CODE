package DAY_4;
import java.util.*;

public class leader_Element {
    public static void main(String[] args) {

        int arr[]={16,17,4,3,5,2};
        Stack<Integer> s=new Stack<>();

        int leader=arr[arr.length-1];
        int i=arr.length-2;
        s.push(leader);

        while(i>=0)
        {
            if(arr[i]>leader)
            {
                leader=arr[i];
                s.push(leader);
               
            }
            i--;

        }

        System.out.println("The leader elements are: ");
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
        
    }
    
    
}
