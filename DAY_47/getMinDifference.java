package DAY_47;
/*
# Leetcode 530
*/

import java.util.ArrayList;

public class getMinDifference {

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

    public static void inorder(TreeNode root,ArrayList<Integer> order)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,order);
        order.add(root.val);
        inorder(root.right,order);
        return;

    }
    public static int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> order=new ArrayList<>();
        inorder(root,order);
        int n=order.size();

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++) {
            if (order.get(i+1) - order.get(i) < ans)
                ans = order.get(i+1) - order.get(i);
        }
        return ans;
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(1);

        int ans=getMinimumDifference(root);
        System.out.println(ans);

    }
    
}
