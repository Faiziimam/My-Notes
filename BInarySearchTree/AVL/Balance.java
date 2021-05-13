 public AVLnode balance(AVLnode root)
    {
        if(leftHeavy(root))
        {
            if(isBalance(root.left)<0)
            {
                root.left=LeftRotation(root.left);

            }
            return RightRotation(root);
        }
        else if(rightHeavy(root))
        {
            if(isBalance(root.right)>0)
            {
                root.right=RightRotation(root.right);
            }
            return LeftRotation(root);
        }
        return root;
    }
    
    
    private boolean leftHeavy(AVLnode root)
    {
        return isBalance(root) > 1;
    }
    private boolean rightHeavy(AVLnode root) {return isBalance(root) < -1; }
    public int isBalance(AVLnode root)
    {
        return (root==null)?0:height(root.left)-height(root.right);
    }
