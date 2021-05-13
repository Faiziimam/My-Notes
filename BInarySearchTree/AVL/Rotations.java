public AVLnode LeftRotation(AVLnode root)
    {
        var newRoot=root.right;
        root.right=newRoot.left;
        newRoot.left=root;

        setHeight(root);
        setHeight( newRoot);

        return newRoot;
    }
    public AVLnode RightRotation(AVLnode root)
    {
        var newRoot=root.left;
        root.left=newRoot.right;
        newRoot.right=root;

        setHeight(root);
        setHeight( newRoot);
        return newRoot;
    }
