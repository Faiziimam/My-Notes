// LCA is basically a common ancestor between both the nodes.
//  for example  :   
//               1
//             2   3
//           4  5    6
//     Q we have to find LCA between [4,6]
//     Ans: we will traverse from the node for 4 we have [1,2]
//                                         for 6 we have [1,3]
//          In both of the above traversal we have 1 in common so LCA is 1
         
//   logic
     
     public node LCA(node root,int n1,n2)
     {
       if(root==null)
       {
        return null;
       }
       if(root.data==n1 || root.data==n2)
          return node;
         
       node left=LCA(root.left,n1,n2);
       node right=LCA(root.right,n1,n2);
       
       if(left!=null && right!=null)
          return node;
       
       return (left!=null) ? left: right;
     }
