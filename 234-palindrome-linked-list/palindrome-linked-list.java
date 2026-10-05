/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=slow;
        ListNode curr=slow;
        ListNode ahead=slow;
        while(curr!=null){
            ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        ListNode temp=head;
        while(temp!=slow){
            if(temp.val!=prev.val){
                return false;
            }
            temp=temp.next;
            prev=prev.next;
        }
        return true;
    }
}