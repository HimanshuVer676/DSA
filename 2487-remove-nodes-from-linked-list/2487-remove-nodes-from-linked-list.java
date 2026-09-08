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
    public ListNode reverse(ListNode head){
        if(head == null) return null;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode removeNodes(ListNode head) {
        if(head == null) return null;
        ListNode newHead = reverse(head);

        int max = newHead.val;
        ListNode curr = newHead;
        
        while(curr != null && curr.next != null){
            if(max > curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
                max = curr.val;
            }
        }

        return reverse(newHead);
    }
}