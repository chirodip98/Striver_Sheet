package Trees;

public class CheckForBalancedBST {

    /*
        A tree is said to be Balanced when for every Node the Height(left-SubTree) - Height(right-SubTree) <=1
     */

    public static int HeightOfTree(TreeNode root)
    {
        if(root==null) return 0;

        return 1 + Math.max( HeightOfTree(root.left), HeightOfTree(root.right));
    }
    public static boolean isBalancedBinaryTree(TreeNode root)  //O(N^2)
    {
        if(root==null) return true;

        int left = HeightOfTree(root.left);         //O(N)
        int right=HeightOfTree(root.right);         //O(N)

        if(Math.abs(left-right)>1) return false;

        return isBalancedBinaryTree(root.left) && isBalancedBinaryTree(root.right) ;

    }


     //LEETCODE SOLUTION
     public static boolean isBalanced(TreeNode root) {

         return modifiedHeight(root)!=-1;
     }

    public static int modifiedHeight(TreeNode root) //O(N)
    {
        if(root==null) return 0;

        int l = modifiedHeight(root.left);
        int r = modifiedHeight(root.right);

        if(l==-1 || r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;

        return 1+Math.max(l,r);
    }

    public static void main(String args[])
    {
        TreeNode Root=new TreeNode<>(3);
        Root.left=new TreeNode<>(9);
        Root.right=new TreeNode<>(20);
        Root.right.left=new TreeNode<>(15);
        Root.right.right=new TreeNode<>(7);
        Root.right.right.left=new TreeNode<>(17);



        System.out.println(isBalancedBinaryTree(Root));
        System.out.println(isBalanced(Root));
    }
}
