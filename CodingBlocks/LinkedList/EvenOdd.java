// Method 1
 public static List oddEven(List head)
 {
     if(head==null)
         throw new IllegalArgumentException();

     List odd_head=null;
     List odd_tail=null;
     List even_head=null;
     List even_tail=null;
     List temp=head;
     boolean isOdd=true;
     while(temp!=null)
     {
        if(isOdd)
        {
            if( odd_head==null)
            {
                odd_head=odd_tail=temp;
            }
            else
            {
                odd_tail.next=temp;
                odd_tail=temp;
            }
            temp=temp.next;
            odd_tail=null;
        }
        else
        {
            if(even_head==null)
            {
                even_head=even_tail=temp;
            }
            else
            {
                even_tail.next=temp;
                even_tail=temp;
            }
            temp=temp.next;
            even_tail=null;
        }
         if (!isOdd) isOdd = true;
         else isOdd = false;
     }
     odd_tail.next=even_head;
     return head;
 }


// Method 2
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        while(even!=null && even.next!=null)
        {
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
