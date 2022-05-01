package Trees;

public class SameTree {
    /*
    Two binary trees are considered the same if they are
    1. structurally identical,
    2. nodes have the same value.
     */

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if( p == null && q== null) return true;

        if(p==null && q!=null || p!=null && q==null) return false;

        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);

        return left && right && p.getData()==q.getData();

    }
    public static void main(String args[])
    {
        TreeNode Root=new TreeNode<>(1);
        Root.left=new TreeNode<>(2);
        Root.right=new TreeNode<>(3);

        TreeNode Root2=new TreeNode<>(1);
        Root2.left=new TreeNode<>(2);
        Root2.right=new TreeNode<>(3);
        Root2.left.right=new TreeNode<>(4);

        System.out.println(isSameTree(Root,Root2));




    }
}
