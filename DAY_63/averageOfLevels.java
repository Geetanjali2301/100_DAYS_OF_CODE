package DAY_63;
/*
# Leetcode 637
*/

import java.util.*;
public  class averageOfLevels {

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

    public static List<Double> averageOfLevels(TreeNode root) {

        List<Double> al=new ArrayList();
        Double sum=0.0;
        Queue<TreeNode> q= new LinkedList();        
        q.add(root);
        while(q.isEmpty()==false){
        sum=0.0;
        int size=q.size();

            for(int i=0;i<size;i++){

                TreeNode node=q.poll();
                sum=sum+node.val;
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }

            al.add(sum/size);
        }
        return al;
    
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        List<Double> ans=averageOfLevels(root);
        System.out.println(ans);

    }
    
}
