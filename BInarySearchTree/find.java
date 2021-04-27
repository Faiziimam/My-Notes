public boolean find(int data)
{
     var temp=root;
     while(temp!=null)
     {
         if(data<temp.data)
         {
             temp=temp.left;
         }
         else if(data> temp.data)
         {
             temp=temp.right;
         }
         else
             return true;
     }
     return false;
}
