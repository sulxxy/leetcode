/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * Difficulty: easy
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode behind = head;
        ListNode forward = head.next;
        while(forward != null){
            while(forward != null && forward.val == behind.val){
                forward = forward.next;
            }
            behind.next = forward;
            behind = forward;
            if(forward == null){
                return head;
            }
            forward = forward.next;
        }
        return head;
    }
}
