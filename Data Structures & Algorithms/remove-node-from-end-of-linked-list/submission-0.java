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

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode firstNode = dummy;
        ListNode secondNode = dummy;

        for(int i=0;i<n;i++){
            secondNode = secondNode.next;
        }

        while(secondNode.next != null){
            secondNode = secondNode.next;
            firstNode = firstNode.next;
        }
        firstNode.next = firstNode.next.next;

        return dummy.next;


    }
}
