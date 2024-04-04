package DAY_46;
/*
# Leetcode 501
*/

import java.util.HashMap;
import java.util.Map;

public class modeOfBST {

    public static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }

    }

    public static void helper(TreeNode root,HashMap<Integer,Integer> mp)
    {
        if(root==null)
        {
            return;
        }

        mp.put(root.val,mp.getOrDefault(root.val,0)+1);
        helper(root.left,mp);
        helper(root.right,mp);
        return;


    }
    public static int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        helper(root,mp);

        int max=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
            }

        }

        int count=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            if(entry.getValue()==max)
            {
                count++;
            }
        }

        int[] ans=new int[count];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            if(entry.getValue()==max)
            {
                ans[i++]=entry.getKey();
            }

        }

        return ans;      
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(2);

        int[] ans=findMode(root);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
