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

    // public class pqComparator implements Comparator<ListNode>{
    //     public int compare(ListNode k1, ListNode k2){
    //         if(k1.val > k2.val){
    //             return 100; // any positive value
    //         }else if(k1.val < k2.val){
    //             return -100; // any negative value
    //         }else{
    //             return 0;
    //         }
    //     }
    // }
    public ListNode mergeKLists(ListNode[] lists) {
        // PriorityQueue<ListNode> pq = new PriorityQueue<>(new pqComparator());
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        for(int i=0; i<lists.length; i++){
            if(lists[i] != null){
                pq.add(lists[i]);
            }
        }

        if(pq.isEmpty()){
            return null;
        }
        while(!pq.isEmpty()){
            ListNode curr = pq.remove();
            tail.next = curr;
            tail = tail.next;
            if(curr.next != null){
                pq.add(curr.next);
            }
        }

        return head.next;

    }
}