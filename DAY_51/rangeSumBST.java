package DAY_51;
/*
# Leetcode 938
*/

import java.util.*;
public class rangeSumBST {

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

    public static void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static int rangeSumBST(TreeNode root, int low, int high) {

        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>=low && arr.get(i)<=high)
            {
                sum+=arr.get(i);
            }
        }

        return sum;
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.left.right=new TreeNode(7);
        root.right=new TreeNode(15);

        int low=7;
        int hight=15;

        int ans=rangeSumBST(root, low, hight);
        System.out.println(ans);

    }
    
}
