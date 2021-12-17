class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public static TreeNode build(int[] inorder,int ins,int ine,int[] postorder,int pos,int poe)
    {
        if(ins>ine || pos>poe)
            return null;
        
        TreeNode root=new TreeNode(postorder[poe]);
        int rootI=0;
        for(int i=0;i<inorder.length;i++)
        { 
          if(inorder[i]==root.val)
          {
            rootI=i;
            break;
          }
        }
        root.left=build(inorder,ins,rootI-1,postorder,pos,pos+rootI-ins-1);
        root.right=build(inorder,rootI+1,ine,postorder,pos+rootI-ins,poe-1);
        return root;
    }
  
}
