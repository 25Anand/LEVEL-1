class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp =head;
        
        if(head==null)
        {
            return head;
        }
        while(temp!=null)
        {
         if((temp.next!=null)&&(temp.val==temp.next.val)){
              temp.next=temp.next.next;
            
        }else
        {
            temp=temp.next;
        }
    }
        return head;
    }
    
}
