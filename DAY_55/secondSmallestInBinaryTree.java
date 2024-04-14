package DAY_55;
/*
# Leetcode 671
*/


import java.util.*;
public class secondSmallestInBinaryTree {

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

    public static int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        helper(root,set);
        List<Integer> lst = new ArrayList<>(set);
        Collections.sort(lst);
        if(lst.size()==1) return -1;
        else return lst.get(1);
        
    }

    public static void helper(TreeNode root, Set<Integer> set){
        if(root==null) return;
        helper(root.left,set);
        set.add(root.val);
        helper(root.right,set);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(9);
        root.right=new TreeNode(10);

        int ans=findSecondMinimumValue(root);
        System.out.println(ans);


    }
    
}
