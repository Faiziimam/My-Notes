package Stack;

public class sumOfNode {
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

    public int sum(node root) {
        if (root == null) {
            return 0;
        }
        return (root.data + sum(root.left) + sum(root.right));
    }

    public static void main(String[] args) {
        sumOfNode obj = new sumOfNode();
        obj.printTree();
        System.out.println(obj.sum(obj.root));

    }
}
