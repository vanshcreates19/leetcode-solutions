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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
           len++;
           temp=temp.next;
        }
        int num=len-n+1;
        int i=1;
        temp=head;
        if(len==n){
            head=head.next;
            return head;
        }
        while(temp!=null){
            if(i+1==num){
                temp.next=temp.next.next;
                return head;
            }
            else{
           
                temp=temp.next;
               i++;
            }
        }
        return head;
    }
}