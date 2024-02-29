import java.util.*;
/*
# Leetcode 1394
*/

public class findLucky {

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getKey()==entry.getValue())
            {
                ans=entry.getKey();
            }

        }
       
        return ans;
        
    }

    public static void main(String[] args) {
        int arr[]={2,2,4,4,4};
        int ans=findLucky(arr);
        System.out.println(ans);
    }
    
}
