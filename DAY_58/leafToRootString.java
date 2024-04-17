package DAY_58;

public class leafToRootString {

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

    static String res = null;
    public static void dfs(TreeNode root, StringBuilder sb) {
        if(root == null){
            return;
        }
        sb.insert(0, (char)('a' + root.val));
        if(root.left == null && root.right == null){
            if(res == null || res.compareTo(sb.toString()) > 0)
                res = sb.toString();
                
        }
        dfs(root.left, sb);
        dfs(root.right, sb);
        sb.deleteCharAt(0);
    }
    public static String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return res;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.right=new TreeNode(2);

        String ans=smallestFromLeaf(root);
        System.out.println(ans);
    }
    
}
