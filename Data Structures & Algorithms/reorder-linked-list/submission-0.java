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
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        
        ListNode first  = head;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        ListNode prev = slow.next = null;

        while(second != null)
        {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        while(first != null && prev != null){
            ListNode temp1 = first.next;
            ListNode temp2 = prev.next;
            first.next = prev;
            prev.next = temp1;
            prev = temp2;
            first = temp1;
        }
        
    }
}
