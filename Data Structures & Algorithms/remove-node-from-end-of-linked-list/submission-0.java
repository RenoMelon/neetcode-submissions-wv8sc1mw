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

        ListNode left = dummy;
        ListNode right = dummy;

        // stap 1: rechts n keer opschuiven
        for(int i = 0; i < n; i++){
            right = right.next;
        }

        // stap 2: pointers samen bewegen

        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        // stap3: delete node and reassign pointer
        left.next = left.next.next;
        return dummy.next;
    }
}

