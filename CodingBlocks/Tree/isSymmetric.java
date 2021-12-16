 public static boolean isMirror(Tree node1,Tree node2)
    {
        if(node1==null && node2==null)
            return true;

        if(node1!=null && node2!=null && node1.data== node2.data)
        {
            return isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);
        }

        return false;
    }
    public static boolean isSymmetric(Tree root)
    {
        return isMirror(root,root);
    }
   
