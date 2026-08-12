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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][] = new int[m][n];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = -1;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        ListNode curr = head;
        while(curr != null){
            q.add(curr.val);
            curr = curr.next;
        }

        int strow = 0;
        int stcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(strow <= endrow && stcol <= endcol){
            for(int j=stcol; j<=endcol; j++){
                if(!q.isEmpty()){
                    matrix[strow][j] = q.remove();
                }
            }
            for(int i=strow+1; i<=endrow; i++){
                if(!q.isEmpty()){
                    matrix[i][endcol] = q.remove();
                }
            }
            for(int j=endcol-1; j>=stcol; j--){
                if(stcol == endcol){
                    break;
                }
                if(!q.isEmpty()){
                    matrix[endrow][j] = q.remove();
                }
            }
            for(int i=endrow-1; i>=stcol+1; i--){
                if(strow == endrow){
                    break;
                }
                if(!q.isEmpty()){
                    matrix[i][stcol] = q.remove();
                }
            }
            strow++;
            stcol++;
            endrow--;
            endcol--;
            
        }

        return matrix;
    }
}