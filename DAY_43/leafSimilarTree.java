package DAY_43;
/*
# Leetcode 872
*/

import java.util.*;

public class leafSimilarTree {

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

    public static ArrayList<Integer> generate_leaflist(TreeNode root,ArrayList<Integer> leafs)
    {
        if(root== null)
        {
            return leafs;
        }
        
        if(root.left==null && root.right==null)
        {
            leafs.add(root.val);
            return leafs;
            
        }

        leafs=generate_leaflist(root.left,leafs);
        leafs=generate_leaflist(root.right, leafs);
        return leafs;
    }

    public static boolean leafSimilar(TreeNode root1,TreeNode root2)
    {
        ArrayList<Integer> leafs_root1=new ArrayList<>();
        ArrayList<Integer> leafs_root2=new ArrayList<>();
        if(generate_leaflist(root1,leafs_root1).equals(generate_leaflist(root2, leafs_root2)))
        {
            return true;

        }
        return false;      

    }

    public static void main(String[] args) {
        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);

        TreeNode root2=new TreeNode(1);
        root2.left=new TreeNode(3);
        root2.right=new TreeNode(2);

        boolean ans=leafSimilar(root1, root2);
        System.out.println(ans);
    }
    
}
