package DAY_72;

import java.util.*;

public class leftView {

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

    public static void leftview(List<Integer> ans,TreeNode root,int level) 
    {
        if(root==null)
        {
            return;
        }

        if(level==ans.size())
        {
            ans.add(root.val);
        }
        leftview(ans,root.left,level+1);
        leftview(ans, root.right, level+1);
    }

    public static List<Integer> leftsideview(TreeNode root)
    {
        List<Integer> ans=new ArrayList<>();
        leftview(ans,root,0);
        return ans;

    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(7);

        List<Integer> ans=leftsideview(root);
        System.out.println(ans);
        
    }
    
}
