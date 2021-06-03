// node which is not having left and right subtree is called leaf nodes.
// logic
int getLeafCount(Node node) 
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }
