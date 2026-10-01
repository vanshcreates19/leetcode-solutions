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
    public ListNode middleNode(ListNode head) {
        int mid=0;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
          len++;
          temp=temp.next;
        }
        temp=head;
       mid=len/2 +1;
       int i=1;
       while(temp!=null){
       if(i==mid){
        return temp;
       }
       else{
        i++;
        temp=temp.next;
       }
       }
       return temp;
    }
}