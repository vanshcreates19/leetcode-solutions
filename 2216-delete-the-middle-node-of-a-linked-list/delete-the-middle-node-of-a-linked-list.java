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
    public ListNode deleteMiddle(ListNode head) {
        int mid=0;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len==1){
            head=null;
            return head;
        }
        temp=head;
        mid=len/2;
        int i=0;
        while(temp!=null){
            if(i+1==mid){
                temp.next=temp.next.next;
                i++;
            }
            else{
                i++;
                temp=temp.next;
            }
        }
        return head;
    }
}