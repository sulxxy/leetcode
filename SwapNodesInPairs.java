/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 *
 * Difficulty: medium
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode forward = head.next;
        ListNode behind = head;
        while(forward != null){
            int tmp = forward.val;
            forward.val = behind.val;
            behind.val = tmp;
            if(forward.next == null){
                return head;
            }
            behind = forward.next;
            forward = behind.next;
        }
        return head;
    }
}
