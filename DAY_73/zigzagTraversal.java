package DAY_73;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class zigzagTraversal {

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

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;

        while(!q.isEmpty())
        {
            int  n=q.size();
            List<Integer> temp=new ArrayList<>();
            Stack<Integer> ReverseStack=new Stack<>();

            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.remove();
                if(flag)
                {
                    ReverseStack.add(curr.val);
                }
                else
                {
                    temp.add(curr.val);
                }

                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }

            flag=!flag;
            while(!ReverseStack.isEmpty())
            {
                temp.add(ReverseStack.pop());
            }

            list.add(temp);
            
        }

        return list;
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        List<List<Integer>> ans=zigzagLevelOrder(root);
        System.out.println(ans);


    }
    
}
