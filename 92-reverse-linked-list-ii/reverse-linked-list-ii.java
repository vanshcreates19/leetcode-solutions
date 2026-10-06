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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
       
        ListNode save1=null;
        ListNode save2=head;
        int i=1;
        while(i<left){
            
            save1=save2;
            save2=save2.next;
           i++;
        }
        ListNode prev=null;
        ListNode curr=save2;
        ListNode ahead=null;
        while(i<=right && curr!=null){
        ahead=curr.next;
        curr.next=prev;
        prev=curr;
        curr=ahead;
        i++;
        }
    if(save1!=null){
        save1.next=prev;}
    
    if(save2!=null){save2.next=ahead;
    }
    if(left==1){
        return prev;
    }
    else{
        return head;
    }
    }
}