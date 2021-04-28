public boolean isBinaryTree()
{
    return isBinaryTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
private boolean isBinaryTree(node root,int min ,int max)
{
    if(root == null)
    {
        return true;
    }
    if(root.data < min || root.data>max)
    {
        return false;
    }
    return isBinaryTree(root.left,min,root.data-1)
            && isBinaryTree(root.right, root.data+1,max);
}
