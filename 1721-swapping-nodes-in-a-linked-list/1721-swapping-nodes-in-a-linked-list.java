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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode curr = head;
        int sz = 0;
        while(curr != null){
            sz++;
            curr = curr.next;
        }

        int arr[] = new int[sz];
        int i = 0;
        curr = head;
        while(curr != null){
            arr[i] = curr.val;
            i++;
            curr = curr.next;
        }

        i = k-1;
        int j = sz-k;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i = 0;
        curr = head;
        while(curr != null){
            curr.val = arr[i];
            i++;
            curr = curr.next;
        }

        return head;
    }
}