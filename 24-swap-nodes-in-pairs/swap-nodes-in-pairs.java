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
    public ListNode swapPairs(ListNode head) {
        ListNode save=null;
     if(head==null || head.next==null){
        return head;
     }
     else{
      save=head.next;
     }
     ListNode temp=head;
     ListNode save1=null;
     ListNode prev=null;
     while(temp!=null && temp.next!=null){
        save1=temp.next;
        temp.next=save1.next;
        save1.next=temp;
          if(prev!=null){
            prev.next=save1;
        }
        prev=temp;
        temp=temp.next;
     }
     return save;
    }
}