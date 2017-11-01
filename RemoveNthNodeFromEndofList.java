/*
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 * Difficulty: medium
 */
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beginning = new ListNode(0);
        beginning.next = head;
        ListNode forward, behind;
        forward = beginning;
        behind = beginning;
        for(int i = 0; i <= n; i++){
            forward = forward.next;
        }
        while(forward != null){
            behind = behind.next;
            forward = forward.next;
        }
        behind.next = behind.next.next;
        return beginning.next;
    }
}
