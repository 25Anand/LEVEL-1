public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;     // move +1
            fast=fast.next.next;    //move +2
            if(slow==fast){ // cycle exist condition
                return true;
            }
            
        }
        return false;
    }
}
