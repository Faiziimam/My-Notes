 public void insert(int data)
   {
       if(root==null)
       {
           root=new node(data);
           return;
       }
       var temp=root;
       while(true)
       {
           if(data< temp.data)
           {
               if(temp.left==null)
               {
                   temp.left=new node(data);
                   break;
               }
               temp=temp.left;
           }
           else
           {
               if(temp.right==null)
               {
                   temp.right=new node(data);
                   break;
               }
               temp=temp.right;
           }
       }
   }
