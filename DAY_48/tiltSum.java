package DAY_48;

public class tiltSum {

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

    
    static int sum=0;

    public static int helper(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=helper(root.left);
        int right=helper(root.right);
        sum+=Math.abs(left-right);
        return root.val+left+right;
    }

    public static int findTilt(TreeNode root) {
        sum=0;
        helper(root);
        return sum;
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        int ans=findTilt(root);
        System.out.println(ans);
    }
    
}
