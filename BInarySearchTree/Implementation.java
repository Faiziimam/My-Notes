package BInarySearchTree;
public class Implementation {
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

    public void inOrder(node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Implementation obj = new Implementation();
        obj.printTree();
        obj.inOrder(obj.root);
    }
}
