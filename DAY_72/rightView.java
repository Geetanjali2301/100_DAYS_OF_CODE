package DAY_72;

import java.util.ArrayList;
import java.util.List;

public class rightView {

    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) 
        {
            this.val=val;
            this.right=null;
            this.left=null;

        }
    }

    public static void rightview(List<Integer> ans,TreeNode root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==ans.size())
        {
            ans.add(root.val);
        }
        rightview(ans,root.right,level+1);
        rightview(ans,root.left,level+1);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        rightview(ans,root,0);
        return ans;
        
    }

    public static void main(String[] args) {
        
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(7);

        List<Integer> ans=rightSideView(root);
        System.out.println(ans);
    }


    
}
