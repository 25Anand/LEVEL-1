class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // complexity---->O(2n)
        
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        if(n==size){
            head=head.next;
            return head;
        }
        for(int i=1;i<size-n;i++){ //size-n --->first calculate size than minus the nth node , got the that wewant 
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
        // complexity---->O(n)
      // 2 pointer approach
        ListNode fast=head,slow=head;
        for(int i=1;i<=n+1;i++){
            if(fast==null){
                return head.next;
            }
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
        
    }
}
