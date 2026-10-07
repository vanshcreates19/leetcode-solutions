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
    public void reorderList(ListNode head) {
       ListNode slow=head;
       ListNode split=null;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        split=slow;
        slow=slow.next;
        fast=fast.next.next;
       }
     if(slow!=fast){
       split.next=null;
       ListNode prev=null;
       ListNode curr=slow;
       ListNode ahead=null;
       while(curr!=null){
        ahead=curr.next;
        curr.next=prev;
        prev=curr;
        curr=ahead;
       }
       ListNode temp=head;
       ListNode save1=null;
       ListNode save2=null;
       while(temp!=null && prev!=null){
       save2=prev.next;
       save1=temp.next;
       temp.next=prev;
       temp.next.next=save1;
       temp=save1;
       if(temp==null){
        prev.next=save2;
        break;
       }
       prev=save2;
      
       }
     }
     
      }
    }
