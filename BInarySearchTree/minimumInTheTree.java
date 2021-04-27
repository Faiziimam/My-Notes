public int min()
{
    if(root==null)
    {
        throw new IllegalStateException();
    }
    var temp=root;
    var last=temp;
    while(temp!=null) {
        last = temp;
        temp = temp.left;
    }
    return last.data;
}
public int min(node root)
{
    //This method is good for binary tree
    if(root.left==null && root.right==null)
    {
        return root.data;
    }
    var left=min(root.left);
    var right=min(root.right);

    return Math.min(Math.min(left,right),root.data);
}
