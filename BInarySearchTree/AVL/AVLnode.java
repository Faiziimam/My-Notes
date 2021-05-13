package com.company;

public class Main {
    private AVLnode root;

    private static class AVLnode{
        public int height;
        public AVLnode left;
        public AVLnode right;
        public int data;

        public AVLnode(int data)
        {
            this.data=data;
        }
    }
    public void insert(int data)
    {
        root=insert(root,data);
    }
    private AVLnode insert(AVLnode root,int data)
    {
        if(root==null)
        {
            return  new AVLnode(data);
        }
        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }
        else {
            root.right = insert(root.right, data);
        }
        setHeight(root);

        return balance(root);
    }

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

    private boolean leftHeavy(AVLnode root)
    {
        return isBalance(root) > 1;
    }
    private boolean rightHeavy(AVLnode root) {return isBalance(root) < -1; }
    public int isBalance(AVLnode root)
    {
        return (root==null)?0:height(root.left)-height(root.right);
    }
    public int height(AVLnode root)
    {
        return (root==null) ? -1 : root.height;
    }

    private void setHeight(AVLnode root)
    {
        root.height=Math.max(height(root.left),height(root.right))+1;
    }

    public void preOrder(AVLnode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(25);

        obj.preOrder(obj.root);


    }
}
