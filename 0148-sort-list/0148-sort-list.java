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
    public ListNode merge(ListNode lh, ListNode rh){
        ListNode newNode = new ListNode(-1);
        ListNode temp = newNode;

        while(lh != null && rh != null){
            if(lh.val > rh.val){
                temp.next = rh;
                temp = temp.next;
                rh = rh.next;
            }else{
                temp.next = lh;
                temp = temp.next;
                lh = lh.next;
            }
        }

        while(lh != null){
            temp.next = lh;
            temp = temp.next;
            lh = lh.next;
        }
        
        while(rh != null){
            temp.next = rh;
            temp = temp.next;
            rh = rh.next;
        }

        return newNode.next;
    }
    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode lh = mergeSort(head);
        ListNode rh = mergeSort(rightHead);

        return merge(lh, rh);
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head == null) return null;

        return mergeSort(head);
    }
}