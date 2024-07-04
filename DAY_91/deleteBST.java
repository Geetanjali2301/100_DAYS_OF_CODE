package DAY_91;
/*
#Leetcode 450
*/

public class deleteBST {

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

    public static TreeNode inordersuccessor(TreeNode root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
        {
            return null;
        }

        if(key>root.val)
        {
           root.right=deleteNode(root.right, key);
        }
        else if(key<root.val)
        {
            root.left=deleteNode(root.left,key);
        }
        else
        {
            //case 1 node is leaf node
            if(root.left==null && root.right==null)
            {
                return null;
            }
            
            //case 2 single child node

            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }

            //case 3 double child 

            TreeNode insuc=inordersuccessor(root.right);
            root.val=insuc.val;
            root.right=deleteNode(root.right,insuc.val);
        
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.right=new TreeNode(7);
        root.left=new TreeNode(1);

        TreeNode ans=deleteNode(root, 7);
        System.out.println(ans.val);

    }
    
}
