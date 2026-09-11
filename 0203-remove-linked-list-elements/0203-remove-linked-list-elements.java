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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        ListNode newNode = new ListNode(-1);
        ListNode curr = head;
        ListNode temp = newNode;

        while(curr != null){
            if(curr.val == val){
                temp.next = curr.next;
                curr = curr.next;
            }else{
                temp.next = curr;
                temp = temp.next;
                curr = curr.next;
            }
        }

        return newNode.next;
    }
}