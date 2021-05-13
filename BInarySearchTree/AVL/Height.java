  public int height(AVLnode root)
    {
        return (root==null) ? -1 : root.height;
    }

    private void setHeight(AVLnode root)
    {
        root.height=Math.max(height(root.left),height(root.right))+1;
    }
