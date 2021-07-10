 static Node addTwoLists(Node first, Node second){
      
       Node res=null;
       Node temp=null;
       Node prev=null;
       int carry=0,sum;
       
       while(first!=null || second!=null)
       {
           sum=carry+(first!=null?first.data:0)+(second!=null?second.data:0);
					 
					 //to check if our sum has greater value than 10
           carry=(sum>=10)?1:0;
					 //To take care of greater values than 10
           sum=sum%10;
           
           temp=new Node(sum);
           if(res==null)
           {
               res=temp;
           }
           else
            prev.next=temp;
        
         prev=temp;
         
         if(first!+null)
            first=first.next;
         if(second!=null)
            second=second.next;
       }
       if(carry>0)
        temp.next=new Node(carry);
        
        return res;
    }
