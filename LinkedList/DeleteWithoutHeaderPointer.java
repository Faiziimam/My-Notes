 void deleteNode(Node pos)
    {
// 	       Side cases
        if(pos==null && pos.next==null)
				 return;
	 
	     Node temp=pos.next;
	     pos.data=pos.next.data;
	  	 pos.next=pos.next.next;
    }
