package Trees;
import java.util.*;


public class Traversals {

    //DFS Traversal - I TimeComplexity: O(N) , SpaceComplexity: O(height of Tree) -> O(N)
    public static void PreOrder(TreeNode<Integer> root)
    {
        if(root!=null) {
            System.out.print(root.getData() + "--");    // Root
            PreOrder(root.left);  //Left SubTree
            PreOrder(root.right); // Right SubTree
        }
        return;
    }

    //DFS Traversal - II
    public static void InOrder(TreeNode<Integer> root)
    {
        if(root!=null)
        {

            InOrder(root.left);  //Left SubTree
            System.out.print(root.getData()+"--");    // Root
            InOrder(root.right); // Right SubTree
        }
        return;
    }

    //DFS Traversal - III
    public static void PostOrder(TreeNode<Integer> root)
    {
        if(root!=null)
        {

            PostOrder(root.left);  //Left SubTree
            PostOrder(root.right); // Right SubTree
            System.out.print(root.getData()+"--");    // Root

        }
        return;
    }

    //BFS Traversal - I LevelOrder
    public static List<Integer> LevelOrder(TreeNode<Integer> root)
    {
        List<Integer> Ans = new LinkedList<>();
        if(root==null) return Ans;

        Queue<TreeNode> levels = new LinkedList<>();
        levels.add(root);

        while(!levels.isEmpty())
        {
            int level = levels.size();
            List<Integer> temp =new ArrayList<>();
            for(int i=0;i<level;i++)
            {
                if(levels.peek().left!=null) levels.offer(levels.peek().left);
                if(levels.peek().right!=null) levels.offer(levels.peek().right);
                temp.add((int)levels.poll().getData());
            }
            Ans.addAll(temp);
        }

        return Ans;
    }


}
