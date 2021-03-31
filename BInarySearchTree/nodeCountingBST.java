package BInarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class nodeCountingBST {
    private node root;

    private static class node {
        private int data;
        private node left;
        private node right;

        // constructor
        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void printTree() {
        node first = new node(1);
        node sec = new node(2);
        node third = new node(3);
        node fourth = new node(4);
        node fifth = new node(5);
        node sixth = new node(6);
        node seven = new node(7);

        root = first;
        first.left = sec;
        first.right = third;

        sec.left = fourth;
        sec.right = fifth;

        third.left = sixth;
        third.right = seven;

    }

   public int countNode()
   {
       if(root==null)
       {
           return 0;
       }
       Queue<node> q=new LinkedList<>();
       q.offer(root);
       int count=0;
       while(!q.isEmpty())
       {
            node temp=q.poll();
        
            if(temp.left!=null && temp.right!=null)
            {
                count++;
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                 if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
            }
       }
     return count;
   }
   public static void main(String[] args) {
       nodeCountingBST obj=new nodeCountingBST();
       obj.printTree();
       System.out.println(obj.countNode());
   }
}
