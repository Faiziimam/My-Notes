class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++)
        {
            if(fast.next == null)//this one is to delete head node and trap invalid values of n
            {
                if(i == n-1)
                    head = head.next;
                return head;
            }
          fast=fast.next;
        }
        
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
