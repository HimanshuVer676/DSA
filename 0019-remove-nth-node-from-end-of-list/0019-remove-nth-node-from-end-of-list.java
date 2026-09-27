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
        if(head.next == null && n == 1){
            return null;
        }

        ListNode curr = head;
        int sz = 0;
        while(curr != null){
            sz++;
            curr = curr.next;
        }
        int num = sz-n;
        curr = head;
        ListNode temp = head;
        if(num == 0){
            return temp.next;
        }else{
            while(num-1 > 0){
                temp = temp.next;
                curr.next = temp;
                curr = curr.next;
                num--;
            }
            curr.next = temp.next.next;
        }

        return head;
    }
}