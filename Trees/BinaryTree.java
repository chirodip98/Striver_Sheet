package Trees;

public class BinaryTree {

    public static TreeNode<Integer> Root;

    public static void main(String[] args) {

        Root=new TreeNode<>(1);
        Root.left=new TreeNode<>(2);
        Root.right=new TreeNode<>(7);
        Root.left.left=new TreeNode<>(3);
        Root.left.right=new TreeNode<>(4);
        Root.left.right.left=new TreeNode<>(5);
        Root.left.right.right=new TreeNode<>(6);

//        Traversals.PreOrder(Root);
//        System.out.println();
//        Traversals.InOrder(Root);
//        System.out.println();
//        Traversals.PostOrder(Root);
//        System.out.println();
//        System.out.println(Traversals.LevelOrder(Root).toString());

        IterativeTraversals.PreOrderIterative(Root);
        IterativeTraversals.InOrderIterative(Root);
        IterativeTraversals.PostOrderIterative(Root);
        IterativeTraversals.AllTraversalsInOne(Root);

        System.out.println(MaxDepthofBinaryTree.maxHeight(Root));
    }
}
