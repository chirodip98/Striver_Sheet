package Trees;

public class MaxDepthofBinaryTree {

    public static int maxHeight(TreeNode root)
    {
        if (root==null) return 0;

        int l=maxHeight(root.left);
        int r=maxHeight(root.right);

        return 1 + Math.max(l,r);
    }
}
