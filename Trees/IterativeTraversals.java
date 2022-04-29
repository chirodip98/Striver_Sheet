package Trees;
import javafx.util.Pair;

import java.util.*;

public class IterativeTraversals {

    public static List<Integer> PreOrderIterative(TreeNode root)
    {
        List<Integer> Nodes = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null) return Nodes;

        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode top = stack.pop();
            Nodes.add((int)top.getData());
            System.out.print((int)top.getData()+" ");

            if(top.right!=null)
                stack.push(top.right);

            if(top.left!=null)
            stack.push(top.left);

        }

        return Nodes;
    }

    public static List<Integer> InOrderIterative(TreeNode root)
    {
        List<Integer> Nodes = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null) return Nodes;
        TreeNode ptr = root;

        while(true)
        {
            if(ptr!=null)
            {
                stack.push(ptr);
                ptr=ptr.left;
            }
            else
            {
                if(stack.isEmpty()) break;
                System.out.println(stack.size());
                ptr = stack.pop();
                Nodes.add((int)ptr.getData());
                ptr=ptr.right;
            }
        }
        System.out.println(Nodes);
        return Nodes;
    }

    public static List<Integer> PostOrderIterative(TreeNode root)
    {
        List<Integer> Nodes = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null) return Nodes;

        TreeNode current = root;

        while(current!=null || !stack.isEmpty())
        {
           if(current!=null)
           {
               stack.push(current);
               current=current.left;
           }
           else
           {
               TreeNode temp =stack.peek().right;
               if(temp==null)
               {
                   temp=stack.pop();
                   Nodes.add((int)temp.getData());
                   while(!stack.isEmpty() && temp==stack.peek().right)
                   {
                       temp=stack.pop();
                       Nodes.add((int)temp.getData());
                   }

               }
               else
               {
                   current=temp;
               }
           }
        }
        System.out.println(Nodes);
        return Nodes;
    }

    public static void AllTraversalsInOne(TreeNode root)
    {
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root,1));

        List<Integer> PreOrder = new ArrayList<>();
        List<Integer> InOrder = new ArrayList<>();
        List<Integer> PostOrder = new ArrayList<>();

        while(!stack.isEmpty())
        {
            Pair<TreeNode,Integer> pair = stack.pop();
            if(pair.getValue()==1)
            {
                PreOrder.add((int)pair.getKey().getData());
                pair=new Pair(pair.getKey(),pair.getValue()+1);

                if(pair.getKey().left!=null) stack.push(new Pair(pair.getKey().left,1));
            }

            if(pair.getValue()==2)
            {
                InOrder.add((int)pair.getKey().getData());
                pair=new Pair(pair.getKey(),pair.getValue()+1);

                if(pair.getKey().right!=null) stack.push(new Pair(pair.getKey().right,1));
            }

            else {
                PostOrder.add((int)pair.getKey().getData());
            }
        }

        System.out.println("PREORDER: "+PreOrder);
        System.out.println("INORDER: "+InOrder);
        System.out.println("POSTORDER: "+PostOrder);

        return;
    }
}
