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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        int i=0;
        while(curr!=null && curr.next!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                int save=curr.val;
                while(curr!=null && curr.val==save){
                    curr=curr.next;
                }
                if(i==0){
                   head=curr;
                }
                prev.next=curr;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
   return dummy.next;
    }
}