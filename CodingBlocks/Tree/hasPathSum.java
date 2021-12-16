 public boolean pathSum(Tree root,int target)
    {
        if(root==null)
            return false;

        if(root.left==null && root.right==null && target-root.data==0)
        {
            return false;
        }

        return pathSum(root.left,target-root.data) || pathSum(root.right,target-root.data);
    }
