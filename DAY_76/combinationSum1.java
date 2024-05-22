package DAY_76;

import java.util.ArrayList;
import java.util.List;

public class combinationSum1 {

    public static void find(int i,int target,List<List<Integer>> ans,int[] candidates,List<Integer> temp)
    {
        if(i==candidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        //take case
        if(candidates[i]<=target)
        {
            temp.add(candidates[i]);
            find(i,target-candidates[i],ans,candidates,temp);
            //while returning
            temp.remove(temp.size()-1);
        }
        find(i+1,target,ans,candidates,temp);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        find(0,target,ans,candidates,new ArrayList<>());
        return ans;
        
    }

    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(arr, target));
    }
    
}
