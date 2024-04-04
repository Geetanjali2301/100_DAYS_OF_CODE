package DAY_46;
/*
# Leetcode 257
*/

import java.util.*;

public class treePaths {

    public static class TreeNode
    {
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

    public static void helper(TreeNode root,StringBuilder s,List<String> ans)
    {
        if(root==null)
        {
            return;
        }
        int v=s.length();

        if(v!=0)
        {
            s.append("->");
        }

        s.append(root.val);
        if(root.left==null && root.right==null)
        {
            ans.add(s.toString());
        }
        helper(root.left, s, ans);
        helper(root.right, s, ans);
        s.setLength(v);//backtrack step to reduce the length ans try the next option which is yet to visit

    }
    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> ans=new ArrayList<>();

        StringBuilder s=new StringBuilder();
        helper(root,s,ans);
        return ans;     
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);

        List<String> ans=binaryTreePaths(root);
        System.out.println(ans);
    }
    
}
