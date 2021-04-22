
public class heightAndDiameter {
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
        node first = new node(8);
        node sec = new node(10);
        node third = new node(3);
        node fourth = new node(1);
        node fifth = new node(6);
        node sixth = new node(14);
        node seven = new node(9);
        node eight = new node(7);
        node nine = new node(13);

        root = first;
        first.left = sec;
        first.right = third;

        sec.left = fourth;
        sec.right = fifth;

        third.left = sixth;
        fifth.left = seven;
        fifth.right = eight;
        sixth.left = nine;
    }

    static class A {
        int ans = Integer.MIN_VALUE;
    }

    int height(node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        // a.ans = Math.max(a.ans, 1 + left + right);

        return 1 + Math.max(left, right);
    }

    // To find if the tree is balanced or not
    boolean isBalanced(node root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    // To find Diameter
    int diamenter(node root) {
        if (root == null)
            return 0;

        A a = new A();
        int dia = height(root, a);

        return a.ans;

    }

    public static void main(String[] args) {
        heightAndDiameter obj = new heightAndDiameter();
        obj.printTree();
        // System.out.println(obj.diamenter(obj.root));
        System.out.println(obj.isBalanced(obj.root));
    }
}
