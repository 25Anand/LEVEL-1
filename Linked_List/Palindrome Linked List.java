class Solution {
    public ListNode FindMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        // Step1---> Find Mid
        ListNode MidNode=FindMid(head);
        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast!=null &&fast.next!=null&&fast.next.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        
        // Step 2----> reverse the 2nd half LL
        ListNode prev=null,curr=MidNode;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        //Step 3----> Check left half and right half
        ListNode right=prev;// head of second part
        ListNode left=head;// head of first part
        while(right!=null){
            if(left.val !=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        
        return true;
    }
}
///SOLUTION 2:

class Solution {
public boolean isPalindrome(ListNode head) {
     if(head == null || head.next == null){
            return true;
        }
        
		// find mid and break linkedlist in two part from mid
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse the second part of linked list
        ListNode curr = slow.next;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        fast = prev; // head of second part
        slow = head; // head of first part
        while(slow != null && fast != null){
            if (slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
}
