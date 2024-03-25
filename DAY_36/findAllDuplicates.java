package DAY_36;
/* 
# Leetcode 442
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> ans=findDuplicates(arr);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
    
}
