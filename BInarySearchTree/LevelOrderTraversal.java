package BInarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private Node root;

    private static class Node {
        private Node left;
        private Node right;
        private int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void printTree() {
        Node first = new Node(1);
        Node sec = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        root = first;
        first.left = sec;
        first.right = third;

        sec.left = fourth;
    }

    public void LevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(" " + temp.data);
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal obj = new LevelOrderTraversal();

        obj.printTree();
        obj.LevelOrder(obj.root);

    }
}
