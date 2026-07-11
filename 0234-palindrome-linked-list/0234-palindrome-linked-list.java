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
    public boolean isPalindrome(ListNode head) {
        // Stack<Integer> st = new Stack<>();

        // ListNode temp = head;
        // while(temp != null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }

        // ListNode curr = head;
        // while(curr != null){
        //     if(curr.val != st.pop()){
        //         return false;
        //     }
        //     curr = curr.next;
        // }

        // return true;
        
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode leftHead = head;
        ListNode rightHead = prev;
        while(rightHead != null){
            if(leftHead.val != rightHead.val){
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }

        return true;
    }
}